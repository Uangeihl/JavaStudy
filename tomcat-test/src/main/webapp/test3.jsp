<%--
  Created by IntelliJ IDEA.
  User: Rick
  Date: 2022/3/23
  Time: 下午 09:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HTMltest</title>
</head>
<body>
<!--headings-->
<h1>heading 1</h1>
<h2>heading 2</h2>
<h3>heading 3</h3>
<h4>heading 4</h4>
<h5>heading 5</h5>
<h6>heading 6</h6>
<!--paragraph-->
<p>Lorem ipsum dolor sit amet, <strong>consectetur adipisicing elit.</strong>> Blanditiis, ipsa?</p>
<p>Lorem <em>ipsum dolor sit</em> amet.</p>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusamus adipisci,
    aut culpa debitis <a href="hello.jsp" target="_blank">dolorem</a> esse eveniet facere fuga laudantium, maiores nesciunt
    pariatur placeat possimus quaerat quas ratione repudiandae veniam, voluptatem!</p>
<!--lists-->
<ul>
    <li>list item1</li>
    <li>list item2</li>
    <li>list item3</li>
    <li>list item4</li>
    <li>list item5</li>
</ul>
<ol>
    <li>list item1</li>
    <li>list item2</li>
    <li>list item3</li>
    <li>list item4</li>
    <li>list item5</li>
</ol>
<!--table-->
<table>
    <thead>
    <tr>
        <th>first name</th>
        <th>last name</th>
        <th>age</th>
        <th>email</th>
    </tr>
    </thead>
    <body>
    <tr>
        <td>leonard</td>
        <td>chan</td>
        <td>19</td>
        <td>abc@qq.com</td>
    </tr>
    <tr>
        <td>leonard</td>
        <td>chan</td>
        <td>19</td>
        <td>abc@qq.com</td>
    </tr>
    </body>
</table>
<br>
<br>
<hr>
<br>
<!--forms-->
<form action="hello.jsp" method="post">
    <div>
        <lable>first name</lable>
        <input type="text" name="first name" placeholder="enter first name">
    </div>
    <div>
        <lable>last name</lable>
        <input type="text" name="lastname" placeholder="enter last name">
    </div>
    <div>
        <lable>email</lable>
        <input type="text" name="email" placeholder="enter email">
    </div>
    <input type="submit" name="submit" value="submit">
</form>
<br>
<button>this is a button</button>
<br>
<img style="width: 20vw" src="img/pic.jpg" alt="not found">
<blockquote>Lorem ipsum dolor sit amet, consectetur adipisicing elit. A adipisci aperiam aspernatur autem eaque, esse explicabo iste itaque iure molestias, nesciunt nobis non odio porro quam saepe sit sunt unde?
</blockquote>
<p><abbr title="massachusetts">MIT</abbr>is a collage</p>
<p><cite>mit  is a collage</cite>by DasAuto</p>
<div style="margin-top: 1000px"></div>
</body>
</html>
