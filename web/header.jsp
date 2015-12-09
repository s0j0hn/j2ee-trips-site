<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<p>
    <a href="<%= application.getContextPath() %>/auth/listTrips">Trips List</a> |

    <% if(session.getAttribute("idbooster") != null) { %>
    <a href="<%= application.getContextPath() %>/logout">Logout</a>
    <a href="<%= application.getContextPath() %>/auth/updateuser"> Your Profile</a>
    <% } else { %>
    <a href="<%= application.getContextPath() %>/login">Login</a>
    <a href="<%= application.getContextPath() %>/register">Register</a>
    <% } %>
</p>