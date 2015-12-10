package com.suptrips.servlets;

import com.suptrips.FactoryDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by root on 09/12/15.
 */
@WebServlet("/auth/AddToBagServlet")
public class AddToBagServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try{
            String idtrip = request.getParameter("idtrip").trim();
            String arrive_date = request.getParameter("arrive_date").trim();
            String arrive_campus = request.getParameter("arrive_campus").trim();
            String depart_date = request.getParameter("depart_date").trim();
            String depart_campus = request.getParameter("depart_campus").trim();

            long idbooster = (long) ((HttpServletRequest) request).getSession().getAttribute("idbooster");

            request.setAttribute("trips", FactoryDao.getTripsDao().getAllTrips());
        }catch(NumberFormatException e) {
        }
        HttpSession session = request.getSession();
        response.sendRedirect(request.getContextPath() + "/search");
    }
}
