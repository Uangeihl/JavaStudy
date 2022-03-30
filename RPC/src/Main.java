import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String name="Cat";
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "select * from rpc.product where name='"+name+"'";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        ResultSet rs= pstmt.executeQuery();
        int id;
        int count;
        while (rs.next()){
            id=rs.getInt("id");
            count=rs.getInt("count");
            System.out.println(id);
            System.out.println(count);
        }
//        System.out.println(rs.getInt("id"));
        Statement stmt = conn.createStatement();
        stmt.close();
        conn.close();
    }

}
