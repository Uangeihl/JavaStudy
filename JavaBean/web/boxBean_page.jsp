<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/1
  Time: ���� 07:57
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
        Box �ĳ��ǣ�
        <%=MyBox.getlength()%>
        <%
            MyBox.setwidth(10);
		%><br>
        Box �Ŀ��ǣ�
        <%=MyBox.getwidth()%>
        <%
            MyBox.setheight(5);
		%><br>
        Box �ĸ��ǣ�
        <%=MyBox.getheight()%><br>
        Box ������ǣ�
        <%=MyBox.BoxVolume()%><br>
        Box �ı�����ǣ�
        <%=MyBox.BoxArea()%>
    </body>
</html>
