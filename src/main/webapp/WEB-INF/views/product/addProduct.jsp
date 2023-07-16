<%--
  Created by IntelliJ IDEA.
  User: playdata
  Date: 2023-07-13
  Time: 오후 6:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
<form method="post" action="/addProduct">
    <input type="text" name="name" placeholder="name">
    <input type="text" name="price" placeholder="price">
    <input type="text" name="count" placeholder="count">
    <input type="submit" value="상품추가">
</form>
</body>
</html>
