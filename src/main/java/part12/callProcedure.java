package part12;

import java.sql.*;

public class callProcedure {

    private Connection connection;

    public void callpro(){
        try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","1234");

            CallableStatement statement1 = connection.prepareCall("{call usersp()}");

            if(statement1.execute()){
                ResultSet resultSet = statement1.getResultSet();
                while (resultSet.next()){
                    System.out.println("name is "+resultSet.getString("name"));
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void calluserbyid(int id){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","1234");

            CallableStatement statement1 = connection.prepareCall("{call user2(?)}");
            statement1.setInt(1,id);

            if(statement1.execute()){
                ResultSet resultSet = statement1.getResultSet();
                while (resultSet.next()){
                    System.out.println("name is "+resultSet.getString("name"));
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void returnnamebyid(int id){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","1234");

            CallableStatement statement1 = connection.prepareCall("{call user3(?,?)}");
            statement1.setInt(1,id);
            statement1.registerOutParameter(2,Types.VARCHAR);

            statement1.execute();

            String name= statement1.getObject(2,String.class);
            System.out.println(name);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
