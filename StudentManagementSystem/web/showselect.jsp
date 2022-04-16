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
    <body>
        <div align="center">
        <%
            String str_pageNow=(String)request.getAttribute("pageNow");
            int pageNow=Integer.parseInt(str_pageNow);
            String str_pageCount=(String)request.getAttribute("pageCount");
            int pageCount=Integer.parseInt(str_pageCount);
            String str_rowCount=(String)request.getAttribute("rowCount");
            int rowCount=Integer.parseInt(str_rowCount);

            out.println("<h3>学生成绩表</h3><br>");
            out.println("共有【"+rowCount+"】条记录，当前显示第【"+pageNow+"】页");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<td>学号</td><td>姓名</td><td>课程名</td><td>成绩</td>");
            out.println("</tr>");
            Object obj = request.getAttribute("selresult");
            ArrayList<Student> al = new ArrayList<>();
            if (obj instanceof ArrayList<?>) {
                for (Object o : (ArrayList<?>) obj) {
                    al.add((Student) o);
                }
            }
            for (Student student : al) {
                out.println("<tr>");
                out.println("<td>"+ student.getId()+"</td><td>"+ student.getName()+"</td><td>"+ student.getClassname()+"</td><td>"+ student.getScore()+"</td>");
                out.println("</tr>");
            }
            out.println("</table><hr>");
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
        </div>
    </body>
</html>
