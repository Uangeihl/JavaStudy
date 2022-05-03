package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconn {
    private Connection conn=null;

    public Connection getConn() throws ClassNotFoundException{
//1.加载数据库驱动
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//2.连接数据库
        try{
            conn= DriverManager.getConnection("jdbc:odbc:xscj","","");
        }catch(Exception e){
            e.getStackTrace();
        }
        return conn;
    }
}
