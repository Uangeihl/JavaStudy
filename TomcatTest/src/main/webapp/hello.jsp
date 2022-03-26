<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/3/6
  Time: 下午 03:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello</title>
</head>
<body>
    <%
        System.out.println("hello,jsp");
        String name1="zhangsan";
    %>
    <%=name1%>
    <%!
        void show(){}
        String name="lisi";
    %>

</body>
</html>
