<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Your Trips</title>
</head>
<body>
<%@ include file="/header.jsp" %>
<h1>List of Your Trips</h1>
<c:forEach items="${trips2}" var="t">
    <p>-------------------------------------------------------------------------------------</p>
    <h3>Trip number : <c:out value="${t.idtrip}"/></h3>
    <c:choose>
        <c:when test="${! empty t.users_idbooster }">
            <h4>RESERVED</h4>
        </c:when>
        <c:otherwise>
            <form method="post" action="<%=request.getContextPath()%>/auth/removetrip">
                <input type="submit" value="Remove">
            </form>
        </c:otherwise>
    </c:choose>
    <h4>Airport name : <c:out value="${t.airport_name}"/></h4>
    <h3>Depart : <c:out value="${t.depart_campus}"/></h3>
    <p>
            <c:out value="${t.depart_date}" />
    <h3>Arrive : <c:out value="${t.arrive_campus}"/></h3>
    <c:out value="${t.arrive_date}" />

    </p>
</c:forEach>
</body>
</html>
