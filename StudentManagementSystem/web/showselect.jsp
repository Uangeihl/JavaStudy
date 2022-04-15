<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/15
  Time: 下午 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>showselect</title>
    </head>
    <body>
        <%
            String str_pageNow=(String)request.getAttribute("pageNow");
            int pageNow=Integer.parseInt(str_pageNow);
            String str_pageCount=(String)request.getAttribute("pageCount");
            int pageCount=Integer.parseInt(str_pageCount);
            String str_rowCount=(String)request.getAttribute("rowCount");
            int rowCount=Integer.parseInt(str_rowCount);
        %>
        out.println("<h3>学生成绩表</h3><br>");
        out.println("共有【"+rowCount+"】条记录，当前显示第【"+pageNow+"】页");


    </body>
</html>
