import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCTEST {
    public static void main(String[] args) throws Exception {
//        1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
//        2.获取连接
        String url="jdbc:mysql://localhost:3306";
        String username="root";
        String password="123456";
        Connection conn=DriverManager.getConnection(url,username,password);
//        3.定义sql
        String sql="UPDATE school.student SET `性别` = 1 WHERE `学号`=0004";
//         4.获取执行sql的对象Statement
        Statement stmt = conn.createStatement();
//        5.执行sql
        int count = stmt.executeUpdate(sql);//影响的行数
//        6.处理结果
        System.out.println(count);
//        7.释放资源
        stmt.close();
        conn.close();
    }



}
