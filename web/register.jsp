
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
<%@ include file="/header.jsp" %>
<form method="post" action="register">

    <label for="id">Idbooster : </label>
    <input id="id" name="id" /><br />

    <label for="firstname">Firstname : </label>
    <input id="firstname" name="firstname" /><br />

    <label for="lastname">Lastname : </label>
    <input id="lastname" name="lastname" /><br />

    <label for="campusname">Campus : </label>
    <input id="campusname" name="campusname" /><br />

    <label for="email">Email : </label>
    <input id="email" name="email" /><br />

    <label for="password">Password : </label>
    <input id="password" name="password" type="password"/><br />
    <input type="submit" />

</form>
</body>
</html>