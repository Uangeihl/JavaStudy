package bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserUtil {
    private String username;
    private String password;
    private Connection con;
    //查询数据库表中的信息是否存在
    public boolean findUser() {
        con = (new DBConnect()).getConnection();
        boolean flag = false;
        Statement stmt;
        ResultSet rs;
        String sql = "select * from users where username='" + username + "' and password='" + password + "'";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            if (rs.next())
                flag = true;
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
