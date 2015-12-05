<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<p>
    <a href="<%= application.getContextPath() %>/listTripsServlet">Trips List</a> |

    <% if(session.getAttribute("idbooster") != null) { %>
    <a href="<%= application.getContextPath() %>/logout">Logout</a>
    <% } else { %>
    <a href="<%= application.getContextPath() %>/login">Login</a>
    <% } %>
</p>