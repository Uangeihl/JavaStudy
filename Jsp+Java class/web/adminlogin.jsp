<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/4/4
  Time: 下午 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <div style="text-align: center;">
      <h2>管理员登录</h2>
      <hr>
      <form action="logincheck.jsp" name="form1" method="post">
        <table><tr><td rowspan=3><img alt="logo" src="images/logo.gif"></td><td>管理员</td><td><input type="text" name="txtname"></td></tr>
          <tr><td>密 码</td><td><input type="password"  name="txtpwd"/></td></tr>
          <tr><td colspan="2" align="right">
            <input type="submit" name="submit" value="登录" /></td></tr>
        </table>
      </form>
    </div>
    <hr/>
  </body>
</html>
