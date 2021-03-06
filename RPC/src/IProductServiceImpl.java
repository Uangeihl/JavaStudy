import java.sql.*;

public class IProductServiceImpl implements IProductService{
    @Override
    public Product findProductByName(String name) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "select * from rpc.product where name='"+name+"'";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        ResultSet rs= pstmt.executeQuery();
        int id= 0;
        int count = 0;
        while (rs.next()){
            id=rs.getInt("id");
            count=rs.getInt("count");
//            System.out.println(id);
        }
        conn.close();
        return new Product(id,name,count);
    }
}
