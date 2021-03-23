package part12;

import java.sql.*;

public class usermanager {

    private Connection connection;
    private Statement statement;


    public void getuserbyid() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","1234");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user");

        DatabaseMetaData metaData = connection.getMetaData();
        ResultSetMetaData resultmeta = resultSet.getMetaData();

        System.out.println(metaData.getDatabaseProductName());
        System.out.println(metaData.getDatabaseProductVersion());
        System.out.println(resultmeta.getColumnCount());
        System.out.println(resultmeta.getTableName(1));
        System.out.println(resultSet.getString(1));
    }

    public void getalluser(){
        try {
          Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","1234");
          Statement statement = connection.createStatement();
          ResultSet resultSet1= statement.executeQuery("select * from user ");

          while (resultSet1.next()){
              System.out.println(resultSet1.getString("name"));
          }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}













