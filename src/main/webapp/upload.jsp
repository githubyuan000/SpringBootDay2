<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/19
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/uploadAction/u" method="post" enctype="multipart/form-data">
        <input type="file" name="upload">
        <input type="submit" value="提交">
    </form><br>
<a href="/sb/uploadAction/downLoad?names=77.jpg">七室-袁苏培</a><br>
    <a href="/sb/uploadAction/sc?names=77.jpg">七室-袁苏培</a>
</body>
</html>
