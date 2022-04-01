<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/1
  Time: 下午 09:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <body>
        <jsp:useBean id="counter" scope="request" class="Bean.Counter" />
        <br>你好！你是第<b><%out.println( counter.getCount() );%></b>位访客
    </body>
</html>
