<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/13
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/sb/admin/save" method="post">
        名称:<input type="text" name="username"/><br>
        密码:<input type="password" name="password"/><br>
        姓名:<input type="text" name="name"/><br>
        性别:<input type="radio" name="sex" value="男">男
        <input type="radio" name="sex" value="女">女<br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
