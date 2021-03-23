package part12;

import java.sql.SQLException;

public class part12Main {
    public static void main(String[] args) {

        usermanager usermanager = new usermanager();

        usermanager.getalluser();

        callProcedure call = new callProcedure();
        //call.callpro();
        //call.calluserbyid(3);
        call.returnnamebyid(2);
    }
}
