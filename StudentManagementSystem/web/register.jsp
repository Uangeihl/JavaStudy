<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/13
  Time: 下午 08:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>register</title>
    </head>
    <body>
        <%
            String message = (String) request.getAttribute("message");
            if(message!=null){
                %>
                <h2><%=message%></h2>
                <%
            }
        %>
        <form action="UserServlet" method="post">
            userName:<input type="text" name="userName"/>
            <br>
            password:<input type="password" name="password"/>
            <br>
            checkpassword:<input type="password" name="checkpassword">
            <input type="submit" name="operate" value="register"/>
        </form>
    </body>
</html>
