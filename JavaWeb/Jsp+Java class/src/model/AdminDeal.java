package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminDeal {
    private Connection cn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private String sql = "";

    public void closeSource() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (cn != null) {
                cn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //判断用户认证信息是否正确
    public boolean findAdmin(String u, String p) throws Exception{
        boolean f;
        f = false;
        cn = new model.DBconn().getConn();
//创建数据库操作声明
        stmt = cn.createStatement();
//查询数据库
        sql = "select * from admin where admin_name='" + u + "'";
        rs = stmt.executeQuery(sql);
//判断密码正确与否
        if (rs.next()) {
            if (p.equals(rs.getString("admin_password"))) {
                f = true;
            }
        }
        return f;
    }

}

