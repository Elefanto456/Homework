<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 27.04.2016
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserList</title>
</head>
<body>
<c:if test="${not empty message}">
    <h1>${message}</h1>
</c:if>
<c:forEach items="${users}" var="user">
    <h2>
        <c:out value="${user.nickname}"/>
    </h2>
</c:forEach>
</body>
</html>