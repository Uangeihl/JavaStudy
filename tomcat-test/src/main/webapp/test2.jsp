<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/3/17
  Time: 下午 09:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java"
         import="java.util.*" %>
<html>
<head>
    <title> test </title>
</head>
<body>
<div style="text-align: center;">
        <%! Date date=new Date(); %>
        <%! int a, b, c; %>
    <% a=12;b=a; c=a+b;%>
    <span style="color: blue; ">
        <%=date.toString()%>
    </span> <br>
    <b>a=<%= a %></b><br>
    <b>b=<%= b %></b><br>
    <b>c=<%= c %></b><br>
</div>
</body>
</html>
