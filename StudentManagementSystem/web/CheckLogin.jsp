
<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/10
  Time: 下午 09:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="Control.DBManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<html>
    <head>
        <title>CheckLogin</title>
    </head>
    <body>

        <%
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");

            //2 连接数据库,查询记录是否存在(登录验证)
            DBManager db = new DBManager();
            String sql = "select * from T_user where userName='"+userName+"' and password='"+password+"'";
            ResultSet rs = db.executeQuery(sql);

            //3 跳转
            if(rs.next()) response.sendRedirect("success.jsp");
            else response.sendRedirect("loginForm.jsp");
        %>

    </body>
</html>
