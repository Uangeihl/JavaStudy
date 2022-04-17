<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/17
  Time: 下午 03:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Modify</title>
    </head>
    <body align="center">
        <h3>修改</h3>
        <%
            String message = (String)request.getAttribute("message");
            if(message!=null){
        %>
        <h4><%=message %></h4>
        <%}%>
        <form action="ScoresOperateServlet">
            <table align="center">
                <tr>
                    <td>学号</td><td>姓名</td><td>操作系统</td><td>微机原理</td><td>计算机网络</td>
                </tr>
                <tr>
                    <td><input type="text" name="id" placeholder="请输入学号"></td>
                    <td><input type="text" name="name" placeholder="请输入姓名"></td>
                    <td><input type="text" name="czxt" placeholder="请输入操作系统成绩"></td>
                    <td><input type="text" name="wjyl" placeholder="请输入微机原理成绩"></td>
                    <td><input type="text" name="jsjwl" placeholder="请输入计算机网络成绩"></td>
                    <td><input type="submit" name="operate" value="modify"></td>
                </tr>
                <tr>
                    <td><a href="/StudentManagementSystem/ShowScoresServlet">返回</a></td>
                </tr>
            </table>
        </form>
    </body>
</html>
