<%@ page import="com.suptrips.TripsDao"%>
<%@ page import="com.suptrips.Trips"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Trips details</title>
</head>
<body>
<%@ include file="/header.jsp" %>

<p>
    Depart :<br />
    <c:out value="${t.depart_date}" />
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
    <c:out value="${trips.users}" /> Utilisateurs


</p>
</body>
</html>