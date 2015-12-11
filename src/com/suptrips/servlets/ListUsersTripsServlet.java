package com.suptrips.servlets;

import com.suptrips.FactoryDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/auth/ListUsersTripsServlet")
public class ListUsersTripsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            long id = (long) ((HttpServletRequest) request).getSession().getAttribute("idbooster");
            request.setAttribute("trips2", FactoryDao.getTripsDao().getAllUsersTrips(id));
            RequestDispatcher rd = request.getRequestDispatcher("/auth/userstrips.jsp");
            rd.forward(request, response);
        }catch(NumberFormatException e) {
            //	out.println("Incorrect format");
        }
    }
}
