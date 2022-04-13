<%@ page import="Control.DBManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="com.sun.javafx.image.BytePixelSetter" %><%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/13
  Time: 下午 08:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>checkregister</title>
    </head>
    <body>
        <%
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            String checkpassword = request.getParameter("checkpassword");
            if(password.equals(checkpassword)){
                DBManager db=new DBManager();
                try {
                    if(db.checklogin(userName,password)) response.sendRedirect("success.jsp");
                    else {
                        try {
                            if(db.register(userName,password)) response.sendRedirect("success.jsp");
                            else response.sendRedirect("register.jsp");
                        } catch (SQLException throwables) {
                            throwables.printStackTrace();
                        }
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            else response.sendRedirect("register.jsp");
        %>
    </body>
</html>
