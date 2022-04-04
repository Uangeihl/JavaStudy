package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    Connection con=null;
    String drivername="com.microsoft.jdbc.sqlserver.SQLServerDriver";
    String   url="jdbc:microsoft:sqlserver://localhost:1433;DatabaseName =UserInfo";
    String username="sa";
    String password="";
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
