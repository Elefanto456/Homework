<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>For Title</title>
    <style type="text/css">
        html, body { height: 100%; margin: 0; padding: 0; }
        #map { height: 100%; }
    </style>
</head>
<body>
<c:if test="${not empty message}">
    <h1>${message}</h1>
</c:if>
Hello, my friend

<%--<p>
    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2243.047275454086!2d49.12008631570433!3d55.79241699640374!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x415ead1154a251b7%3A0x9d2bb4764b144bf0!2z0YPQuy4g0JrRgNC10LzQu9C10LLRgdC60LDRjywgMzUsINCa0LDQt9Cw0L3RjCwg0KDQtdGB0L8uINCi0LDRgtCw0YDRgdGC0LDQvSwgNDIwMTEx!5e0!3m2!1sru!2sru!4v1460449332952"
            width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
</p>--%>

<%--<script async defer
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAjoyxL6JDv9JsgUHXZftC442-KHtp27jw&callback=initMap">
</script>--%>

</body>
</html>