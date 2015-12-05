package com.suptrips.servlets;

import com.suptrips.FactoryDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/listTrips")
public class ListTripsServlet extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("trips", FactoryDao.getTripsDao().getAllTrips());
        RequestDispatcher rd = request.getRequestDispatcher("/listTrips.jsp");
        rd.forward(request, response);
    }
}