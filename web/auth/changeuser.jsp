
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/header.jsp" %>
<form method="post" action="updateuser">
    <label for="newfirstname">New firstname : </label>
    <input id="newfirstname" name="newfirstname"  /><br />
    <label for="newpassword">New Password : </label>
    <input id="newpassword" name="newpassword" type="password" /><br />
    <label for="newlastname">New lastname : </label>
    <input id="newlastname" name="newlastname"  /><br />
    <label for="newemail">New email : </label>
    <input id="newemail" name="newemail"  /><br />
    <input type="submit" />
</form>
