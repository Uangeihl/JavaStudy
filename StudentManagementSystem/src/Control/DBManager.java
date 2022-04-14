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

    public ResultSet executeQuery(String sql) throws SQLException {
        conn=DBManager.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet resultSet=stmt.executeQuery(sql);
        return resultSet;
    }
    public int executeUpdate(String sql) throws SQLException {
        conn=DBManager.getConnection();
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate(sql);
        return result;
    }
}
