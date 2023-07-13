
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User</title>
</head>
<body>
    <table>
        <tr>
            <td>No</td>
            <td>Id</td>
            <td>Password</td>
            <td>Name</td>
            <td>Address</td>
            <td>Phone</td>
        </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.user_seq}</td>
            <td>${user.id}</td>
            <td>${user.password}</td>
            <td>${user.name}</td>
            <td>${user.address}</td>
            <td>${user.phone}</td>

            <td><a href="/update/${user.user_seq}">수정</a></td>
            <td><a href="/delete/${user.user_seq}">삭제</a></td>
        </tr>

    </c:forEach>
    </table>
</body>
</html>
