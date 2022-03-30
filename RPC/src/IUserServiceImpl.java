import java.sql.*;

public class IUserServiceImpl implements IUserService {
    @Override
    public User findUserById(int id) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "select * from rpc.user where id='"+id+"'";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        ResultSet rs= pstmt.executeQuery();
        String name="";
        while (rs.next()){
            name=rs.getString("name");
//            System.out.println(name);
        }
        conn.close();
        return new User(id, name);
    }
}
