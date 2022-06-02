<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/13
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1px solid green">
        <thead>
        <tr>
            <td>名称</td>
            <td>密码</td>
            <td>姓名</td>
            <td>性别</td>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${adminList}" var="admin">
                <tr>
                    <td>${admin.username}</td>
                    <td>${admin.password}</td>
                    <td>${admin.name}</td>
                    <td>${admin.sex}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
