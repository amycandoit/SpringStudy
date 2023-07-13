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
    <c:forEach items="${}" var="">
    <tr>
        <td>${user.user_seq}</td>
        <td>${user.name}</td>
        <td>${user.price}</td>
        <td>${user.count}</td>

        <td><a href="/pUpdate/${user.user_seq}">수정</a></td>
        <td><a href="/pDelete/${user.user_seq}">삭제</a></td>
    </tr>

    </c:forEach>
</body>
</html>
