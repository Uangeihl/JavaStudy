<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/10
  Time: 下午 05:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <form action="CheckLogin.jsp" method="post">
        userName:<input type="text" name="userName"/>
        <br>
        password:<input type="password" name="password"/>
        <input type="submit" value="login"/>
        </form>
        <form action="register.jsp">
            <input type="submit" value="register">
        </form>
    </body>
</html>
