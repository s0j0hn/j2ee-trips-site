
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/header.jsp" %>
<c:forEach items="${users}" var="u">
<form method="post" action="updateuser">
    <label for="newfirstname">New firstname : </label>
    <input id="newfirstname" name="newfirstname" value="<c:out value="${u.firstname}"" /><br />
    <label for="newpassword">New Password : </label>
    <input id="newpassword" name="newpassword" type="password" /><br />
    <label for="newlastname">New lastname : </label>
    <input id="newlastname" name="newlastname" value="<c:out value="${u.lastname}"" /><br />
    <label for="newemail">New email : </label>
    <input id="newemail" name="newemail" value="<c:out value="${u.email}"" /><br />
    <input type="submit" />
</c:forEach>
</form>
