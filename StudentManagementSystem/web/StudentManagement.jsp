<%@ page import="Control.Student" %>
<%@ page import="java.util.ArrayList" %>
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
    <body align="center">
        <h1>学生成绩表</h1>
        <table align="center">
            <tr>
                <td>
                    <form action="Add.jsp" method="post"><input type="submit" name="operate" value="add"></form>
                </td>
                <td>
                    <form action="Modify.jsp" method="post"><input type="submit" name="operate" value="modify"></form>
                </td>
                <td>
                    <form action="Delete.jsp" method="post"><input type="submit" name="operate" value="delete"></form>
                </td>
            </tr>
        </table>
        <table border='1' align='center'>
        <tr>
            <td>学号</td><td>姓名</td><td>操作系统</td><td>微机原理</td><td>计算机网络</td>
        </tr>
        <%
            String str_pageNow=(String)request.getAttribute("pageNow");
            int pageNow=Integer.parseInt(str_pageNow);
            String str_pageCount=(String)request.getAttribute("pageCount");
            int pageCount=Integer.parseInt(str_pageCount);
            String str_rowCount=(String)request.getAttribute("rowCount");
            int rowCount=Integer.parseInt(str_rowCount);

            Object obj = request.getAttribute("selresult");
            ArrayList<Student> al = new ArrayList<>();
            if (obj instanceof ArrayList<?>) {
                for (Object o : (ArrayList<?>) obj) {
                    al.add((Student) o);
                }
            }
            for (Student student : al) {
                out.println("<tr>");
                out.println("<td>"+ student.getId()+"</td><td>"+ student.getName()+"</td><td>"+ student.getCzxt()+"</td><td>"+ student.getWjyl()+"</td><td>"+ student.getJsjwl()+"</td>");
                out.println("</tr>");
            }

            out.println("</table><br>");
            out.println("共有【"+rowCount+"】条记录，当前显示第【"+pageNow+"】页<br><br>");

            out.println("<a href=/StudentManagementSystem/ShowScoresServlet?pageNow=1>首页</a>");
            if(pageNow>1){
                out.println("<a href=/StudentManagementSystem/ShowScoresServlet?pageNow="+(pageNow-1)+">上一页</a>");
            }
            for (int i = 1; i <= pageCount; i++) {
                out.println("<a href=/StudentManagementSystem/ShowScoresServlet?pageNow="+i+">["+i+"]</a>");
            }
            if(pageNow<pageCount){
                out.println("<a href=/StudentManagementSystem/ShowScoresServlet?pageNow="+(pageNow+1)+">下一页</a>");
                out.println("<a href=/StudentManagementSystem/ShowScoresServlet?pageNow="+pageCount+">尾页</a>");
            }
        %>
    </body>
</html>
