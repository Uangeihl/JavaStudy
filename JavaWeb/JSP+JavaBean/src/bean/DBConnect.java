package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    Connection con=null;
    String drivername="com.mysql.cj.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306";
    String username="root";
    String password="123456";
    public DBConnect() {
    }
    public Connection getConnection(){
        try{
            Class.forName(drivername);
            con= DriverManager.getConnection(url,username,password);
            System.out.println("数据库连接成功！");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
}
