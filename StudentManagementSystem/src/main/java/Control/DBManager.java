package Control;

import java.sql.*;

public class DBManager {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306";
    private static final String username = "root";
    private static final String password = "123456";

    private static Connection conn;

    static {
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    static {
        try {
            Class.forName(driver);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ResultSet executeQuery(String sql) throws SQLException {
        PreparedStatement pstmt=conn.prepareStatement(sql);
        return pstmt.executeQuery();
    }
}
