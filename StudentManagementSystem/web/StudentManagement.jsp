<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/10
  Time: 下午 09:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Control.Operate" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Control.Student" %>
<html>
    <head>
        <title>success</title>
    </head>
    <body>
        <div style="text-align: center;">
            <table border="2">
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>classname</th>
                    <th>score</th>
                    <th>operate</th>
                </tr>
                <%
                    Operate operate = new Operate();
                    ArrayList<Student> show = new ArrayList<Student>();
                    try {
                        show = operate.show();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    for (Student student : show) {
                        %>
                        <tr>
                            <td><%=student.getId()%></td>
                            <td><%=student.getName()%></td>
                            <td><%=student.getClassname()%></td>
                            <td><%=student.getScore()%></td>
                            <td>
                                <form action="StudentServlet">
                                <input type="submit" name="operate" value="delete">
                                <input type="submit" name="operate" value="modify">
                                </form>
                            </td>
                        </tr>
                    <%}%>
            </table>
        </div>
    </body>
</html>
