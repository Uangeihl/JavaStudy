package Control;

import java.sql.*;

public class DBManager {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306";
    private static String username = "root";
    private static String pwd = "123456";
    private static Connection conn = null;
    static {
        try {
            Class.forName(driver);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(url, username, pwd);
            return conn;
        }
        return conn;
    }

    public boolean checklogin(String userName,String password) throws SQLException {
        boolean result=false;
        conn=DBManager.getConnection();
        Statement stmt = conn.createStatement();
        String sql = "select * from user.check where userName='"+userName+"'and password='"+password+"'";
        ResultSet resultSet = stmt.executeQuery(sql);
        if(resultSet.next()) result = true;
        stmt.close();
        return result;
    }

    public boolean register(String userName, String password) throws SQLException {
        if(userName==null||password==null) return false;
        boolean result=false;
        conn=DBManager.getConnection();
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO user.check (userName,password) values('"+userName+"', '"+password+"')";
        if(stmt.executeUpdate(sql)>=1) result=true;
        stmt.close();
        return result;
    }


}
