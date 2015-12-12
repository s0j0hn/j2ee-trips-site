<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<%@ include file="/header.jsp" %>
    <form method="post" action="login">
        <label for="idbooster">Idbooster : </label>
        <input id="idbooster" name="idbooster"  required  /><br />
        <label for="password">Password : </label>
        <input id="password" name="password" type="password" required /><br />
        <input type="submit" value="Login"/>
    </form>
</body>
</html>