<%--
  Created by IntelliJ IDEA.
  User: playdata
  Date: 2023-07-12
  Time: 오후 7:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Signup</title>
</head>
<body>
    <form method="post" action="/signup">
        <input type="text" name="id" placeholder="id">
        <input type="text" name="password" placeholder="password">
        <input type="text" name="name" placeholder="name">
        <input type="text" name="address" placeholder="address">
        <input type="text" name="phone" placeholder="phone">
        <input type="submit" value="회원가입">
    </form>
</body>
</html>
