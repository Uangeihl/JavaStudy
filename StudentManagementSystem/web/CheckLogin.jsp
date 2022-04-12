
<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/10
  Time: 下午 09:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="Control.DBManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>
<html>
    <head>
        <title>CheckLogin</title>
    </head>
    <body>

        <%
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");

            //连接数据库,查询记录是否存在(登录验证)
            DBManager db = new DBManager();
            String sql = "select * from user.check where userName='"+userName+"' and password='"+password+"'";
            ResultSet resultSet = null;
            try {
                resultSet = db.executeQuery(sql);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            //跳转
            if(resultSet.next()) response.sendRedirect("success.jsp");
            else response.sendRedirect("error.jsp");
        %>

    </body>
</html>
