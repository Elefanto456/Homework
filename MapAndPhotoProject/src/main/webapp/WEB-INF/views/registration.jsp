<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Registration</title>
    <link href="../assets/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="../assets/bootstrap/css/bootstrap.css.map" rel="stylesheet">
    <link href="../assets/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="../assets/bootstrap/css/bootstrap-theme.min.css.map" rel="stylesheet">
    <link href="../assets/bootstrap/css/bootstrap.min.css.map" rel="stylesheet">
    <link href="../assets/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="../assets/bootstrap/css/bootstrap-theme.css.map" rel="stylesheet">
    <link href="../assets/bootstrap/css/bootstrap-theme.css" rel="stylesheet">
    <link href="../assets/css/colorgraph.css" rel="stylesheet">
</head>
<body>
<%--Ссылка на лист--%>
<h3><a href="/project/userList" target="_blank">List of User</a></h3>
<%--Вывод message--%>
<c:if test="${not empty message}">
    <h1>${message}</h1>
</c:if>
<%--Форма регистрации--%>
<%--<form:form commandName="user">--%>
<div class="container">
    <div class="row">
        <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
            <%--<form role="form" action="" form method="POST">--%>
            <form:form commandName="user">
            <h2>Sign Up</h2>
            <hr class="colorgraph">
            <div class="form-group">
                <form:input type="text" name="name" id="first_name" class="form-control input-lg" placeholder="Name"
                            tabindex="1" path="name"/>
            </div>
            <div class="form-group">
                <form:input type="text" name="nickname" id="display_name" class="form-control input-lg"
                            placeholder="Nickname" tabindex="3" path="nickname"/>
            </div>
            <div class="form-group">
                <form:input type="email" name="email" id="email" class="form-control input-lg"
                            placeholder="Email Address" tabindex="4" path="email"/>
            </div>
            <div class="row">
                <div class="col-xs-12 col-sm-6 col-md-6">
                    <div class="form-group">
                        <form:input type="password" name="password" id="password" class="form-control input-lg"
                                    placeholder="Password" tabindex="5" path="password"/>
                    </div>
                </div>
            </div>
            <hr class="colorgraph">
            <div class="row">
                <div class="col-xs-12 col-md-6"><input type="submit" value="Register"
                                                       class="btn btn-primary btn-block btn-lg" tabindex="7">
                </div>
            </div>
            </form:form>
        </div>
            <%--</form>--%>
    </div>
</div>
<%--</form:form>--%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="../assets/js/registration.js"></script>
<script src="../assets/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>