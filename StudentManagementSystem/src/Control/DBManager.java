package Control;

import java.sql.*;

public class DBManager {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306";
    private static final String username = "root";
    private static final String pwd = "123456";
    private static Connection conn = null;
    private static Statement stmt = null;
    private static ResultSet resultSet = null;
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
    public void close() throws SQLException {
        if(stmt!=null)
            stmt.close();
        if(conn!=null)
            conn.close();
        if(resultSet!=null)
            resultSet.close();
    }
    public ResultSet executeQuery(String sql) throws SQLException {
        conn=getConnection();
        Statement stmt = conn.createStatement();
        ResultSet resultSet=stmt.executeQuery(sql);
        return resultSet;
    }
    public int executeUpdate(String sql) throws SQLException {
        conn=getConnection();
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate(sql);
        return result;
    }
}
