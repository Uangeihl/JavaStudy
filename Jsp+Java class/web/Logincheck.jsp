<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/4
  Time: ���� 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <jsp:useBean id="adl" scope="page" class="model.AdminDeal" />
        <%
        String adminname=request.getParameter("txtname");
        String adminpwd=request.getParameter("txtpwd");
        String sql="";
        //����AdminDeal������֤
        //AdminDeal adl=new AdminDeal();//���õ�ͬ�����ɫ����
        if (adl.findAdmin(adminname,adminpwd)){
            response.sendRedirect("welcome.jsp");
        }else{
            response.sendRedirect("adminlogin.jsp");
        }
        %>

    </body>
</html>
