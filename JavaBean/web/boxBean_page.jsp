<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/1
  Time: 下午 07:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=GB2312"%>
    <html>
    <body>
        <jsp:useBean id="MyBox" class="Bean.Box">
        </jsp:useBean>
        <%
            MyBox.setlength(20);
		%>
        Box 的长是：
        <%=MyBox.getlength()%>
        <%
            MyBox.setwidth(10);
		%><br>
        Box 的宽是：
        <%=MyBox.getwidth()%>
        <%
            MyBox.setheight(5);
		%><br>
        Box 的高是：
        <%=MyBox.getheight()%><br>
        Box 的体积是：
        <%=MyBox.BoxVolume()%><br>
        Box 的表面积是：
        <%=MyBox.BoxArea()%>
    </body>
</html>
