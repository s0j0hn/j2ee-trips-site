<%@ page import="com.suptrips.TripsDao"%>
<%@ page import="com.suptrips.Trips"%>
<%@ page import="com.suptrips.Users"%>
<%@ page import="com.suptrips.UsersDao"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>List of Trips</title>
</head>
<body>
<%@ include file="/header.jsp" %>
<c:out value="${users.firstname}" />
    <h1>List of All Trips</h1>
    <c:forEach items="${trips}" var="t">
        <p>-------------------------------------------------------------------------------------</p>
        <h2>Depart : <c:out value="${t.depart_campus}"/></h2>
        <p>
            <c:out value="${t.depart_date}" /><br />
        <h2>Arrive : <c:out value="${t.arrive_campus}"/></h2>
        <c:out value="${t.arrive_date}" />  <br />

        <c:if test="${! empty sessionScope.idbooster}">
            <form method="post" action="<%=request.getContextPath()%>/auth/addToBag">
                <input type="submit" value="Add to Bag">
            </form>
        </c:if>
        </p>
    </c:forEach>
</body>
</html>
