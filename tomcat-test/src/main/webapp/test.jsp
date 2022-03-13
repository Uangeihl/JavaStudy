<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/3/13
  Time: 下午 09:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;
                  charset=gb2312" %>
<HTML>
<BODY>
你好,今天是
<%
    Date today=new Date();
%>
<%=today.getDate()%>号，
星期<%=today.getDay()%>
</BODY>
</HTML>

