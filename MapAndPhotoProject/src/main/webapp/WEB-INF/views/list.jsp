<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Photo</title>
</head>
<body>
<c:if test="${not empty message}">
    <h1>${message}</h1>
</c:if>
<c:forEach items="${photos}" var="photo">
    <div style="border:1px solid black;float:left;padding:10px;height:300px;margin:10px;width:300px;">
        <img src="${photo.path}" style="width:280px;height:280px;" alt="Photo (${photo.x}, ${photo.y})">
    </div>
</c:forEach>
</body>
</html>
