<%--
  Created by IntelliJ IDEA.
  User: playdata
  Date: 2023-07-13
  Time: 오후 7:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Update</title>
</head>
<body>
<form action="/productUpdate" method="post">
  <input type="hidden" name = "user_seq" value="${product.user_seq}" >
  <input type="text" name = "nema" value="${product.name}" >
  <input type="text" name = "price" value="${product.price}">
  <input type="text" name = "count" value="${product.count}">
  <input type="submit" value="수정">
</form>
</body>
</html>
