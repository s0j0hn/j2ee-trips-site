
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/header.jsp" %>
<form method="post" action="updateuser">
    <label for="firstname">New firstname : </label>
    <input id="firstname" name="firstname"  /><br />
    <label for="newpassword">New Password : </label>
    <input id="newpassword" name="newpassword" type="password" /><br />
    <label for="lastname">New lastname : </label>
    <input id="lastname" name="lastname"  /><br />
    <label for="email">New email : </label>
    <input id="email" name="email"  /><br />
    <input type="submit" />
</form>
