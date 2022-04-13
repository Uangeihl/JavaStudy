
<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/10
  Time: ÏÂÎç 09:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" %>
<%@ page import="Control.DBManager" %>
<html>
    <head>
        <title>CheckLogin</title>
    </head>
    <body>
        <%
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");

            DBManager db = new DBManager();
            if(db.checklogin(userName,password)) response.sendRedirect("success.jsp");
            else response.sendRedirect("error.jsp");
        %>
    </body>
</html>
