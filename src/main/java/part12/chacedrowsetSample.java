package part12;

import java.sql.*;

public class chacedrowsetSample {

    private Connection connection;
    private Statement statment;

    public chacedrowsetSample() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","1234");
            Statement statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void insetuser(ResultSet resultSet) throws SQLException {
        resultSet.moveToInsertRow();

        resultSet.updateInt("id",4);
        resultSet.updateString("name","bahram");
    }
}
