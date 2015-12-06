<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.suptrips.TripsDao"%>
<%@ page import="com.suptrips.Trips"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Product details</title>
</head>
<body>
<%@ include file="/header.jsp" %>

<p>
    Depart :<br />
    <c:out value="${trips.depart_date}" />
    <br />
    <c:out value="${trips.depart_campus}" />
</p>

<p>
    Arrive :<br />
    <c:out value="${trips.arrive_date}" />
    <br />
    <c:out value="${trips.arrive_campus}" />
</p>

<p>
    <c:out value="${trip.users}" /> euros

    <c:if test="${! empty sessionScope.idbooster}">

</c:if>
</p>
</body>
</html>