<%@ page import="com.suptrips.Users"%>
<%@ page import="com.suptrips.UsersDao"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Your profile</title>
</head>
<body>
<%@ include file="/header.jsp" %>
<form method="post" action="updateuser">
    <c:forEach items="${users}" var="u">
        <label for="firstname">New firstname : </label>
        <input id="firstname" name="firstname" value="<c:out value="${u.firstname}"/>" /><br />
        <label for="password">New Password : </label>
        <input id="password" name="password" type="password" /><br />
        <label for="lastname">New lastname : </label>
        <input id="lastname" name="lastname" value="<c:out value="${u.lastname}"/>" /><br />
        <label for="email">New email : </label>
        <input id="email" name="email" value="<c:out value="${u.email}"/>" /><br />
        <input type="submit" />
    </c:forEach>
</form>
</body>
</html>
