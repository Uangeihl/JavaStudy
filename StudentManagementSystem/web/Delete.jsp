<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/17
  Time: 下午 03:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Delete</title>
    </head>
    <body align="center">
        <h2>删除</h2>
        <%
            String message = (String)request.getAttribute("message");
            if(message!=null){
        %>
        <h4><%=message %></h4>
        <%}%>
        <form action="ScoresOperateServlet">
            <table align="center">
                <tr>
                    <td>学号</td>
                    <td><input type="text" name="id" placeholder="请输入学号"></td>
                    <td><input type="submit" name="operate" value="delete"></td>
                </tr>
            </table>
            <br>
            <td><a href="/StudentManagementSystem/ShowScoresServlet">返回</a></td>
        </form>
    </body>
</html>
