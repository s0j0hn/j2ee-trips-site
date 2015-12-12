package com.suptrips.servlets;

import com.suptrips.FactoryDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SearchTripByAirportServlet")
public class SearchTripByAirportServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String airport = request.getParameter("airport").trim();
        request.setAttribute("trips5", FactoryDao.getTripsDao().getAllTripsByAirport(airport));
        RequestDispatcher rd = request.getRequestDispatcher("/searchairport.jsp");
        rd.forward(request, response);
    }
}
