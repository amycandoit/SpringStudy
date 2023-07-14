<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<table>
    <tr>
        <td>No</td>
        <td>Name</td>
        <td>Price</td>
        <td>Count</td>
    </tr>
    <c:forEach items="${products}" var="product">
    <tr>
        <td>${product.user_seq}</td>
        <td>${product.name}</td>
        <td>${product.price}</td>
        <td>${product.count}</td>

        <td><a href="/productUpdate/${product.user_seq}">수정</a></td>
        <td><a href="/productDelete/${product.user_seq}">삭제</a></td>
    </tr>

    </c:forEach>
</body>
</html>
