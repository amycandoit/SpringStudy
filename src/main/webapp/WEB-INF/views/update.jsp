<%--
  Created by IntelliJ IDEA.
  User: playdata
  Date: 2023-07-11
  Time: 오후 6:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<form action="/update" method="post">
    <input type="hidden" name = "user_seq" value="${user.user_seq}" >
    <input type="text" name = "id" value="${user.id}" >
    <input type="text" name = "password" value="${user.password}">
    <input type="text" name = "name" value="${user.name}">
    <input type="text" name = "address" value="${user.address}">
    <input type="text" name = "phone" value="${user.phone}">
    <input type="submit" value="수정">
</form>
</body>
</html>
