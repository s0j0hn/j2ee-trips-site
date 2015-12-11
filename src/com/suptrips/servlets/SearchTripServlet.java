package com.suptrips.servlets;

import com.suptrips.FactoryDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SearchTripServlet")
public class SearchTripServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String campus = request.getParameter("campus_list").trim();
        int choice = Integer.parseInt(request.getParameter("choice").trim());
        request.setAttribute("trips3", FactoryDao.getTripsDao().getAllTripsByCampus(campus,choice));
        RequestDispatcher rd = request.getRequestDispatcher("/searchresult.jsp");
        rd.forward(request, response);
    }
}
