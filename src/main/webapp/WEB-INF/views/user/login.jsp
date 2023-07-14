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
    <title>Login</title>
</head>
<body>
    <form method="post" action="/login">
        <input type="text" name="id" placeholder="id">
        <input type="text" name="password" placeholder="password">
        <input type="submit" value="로그인">
    </form>
</body>
</html>
