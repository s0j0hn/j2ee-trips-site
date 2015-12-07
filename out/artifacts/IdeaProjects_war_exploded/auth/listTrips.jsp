<%@ page import="com.suptrips.TripsDao"%>
<%@ page import="com.suptrips.Trips"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>List of Trips</title>
</head>
<body>
<%@ include file="/header.jsp" %>
    <h1>List of All Trips</h1>
    <c:forEach itemps="${trips}" var="t">
        <h2><c:out value="${t.depart_campus}"/></h2>
        <p>
            <c:out value="${t.depart_date}" /><br />
            <c:out value="${t.arrive_date}" />  <br />
            <a href="/auth/showTrip?id=<c:out value="${t.idtrip}" />">Show details</a>
        </p>
    </c:forEach>
</body>
</html>
