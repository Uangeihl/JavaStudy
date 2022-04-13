package Control;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBManager db = new DBManager();
        String userName = "lisi";
        String password = "1234";
        if(db.checklogin(userName,password))
        System.out.println(1);
    }
}
