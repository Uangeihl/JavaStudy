<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/4
  Time: ÏÂÎç 02:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" pageEncoding="gb2312"%>
<%@page import="bean.UserUtil"%>
<jsp:useBean id="user" class="bean.UserUtil" scope="page">
    <jsp:setProperty name="user" property="*"/></jsp:useBean>

<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <%
            if (user.findUser()){
                String username = request.getParameter("username");
                session.setAttribute("username", username);
        %>
        <jsp:forward page="welcome.jsp"></jsp:forward>
        <%
        } else {
        %>
        <jsp:forward page="error.jsp"></jsp:forward>
        <%
            }
        %>
    </body>
</html>
