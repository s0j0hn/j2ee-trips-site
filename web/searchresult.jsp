<html>
<head>
    <title>Search result</title>
</head>
<body>
<%@ include file="/header.jsp" %>
<c:forEach items="${trips3}" var="t">
    <p>-------------------------------------------------------------------------------------</p>
    <h3>Trip number : <c:out value="${t.idtrip}"/></h3>
    <c:choose>
        <c:when test="${! empty t.users_idbooster }">
            <h4>Taken by idbooster : <c:out value="${t.users_idbooster}"/></h4>
        </c:when>
        <c:otherwise>
            <h4>AVAILABLE</h4>
            <form method="post" action="<%=request.getContextPath()%>/auth/addToBag">
                <input type="submit" value="Add to Bag">
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
