<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Photo</title>
</head>
<body>
<h3><a href="/project/photoList" target="_blank">List of photo</a></h3>
<c:if test="${not empty message}">
    <h1>${message}</h1>
</c:if>
<form:form commandName="photo">
    X: <form:input path="x"/><br>
    Y: <form:input path="y"/><br>
    Path: <form:input path="path"/><br>
    <input type="submit" value="Send photo">
</form:form>
</body>
</html>
