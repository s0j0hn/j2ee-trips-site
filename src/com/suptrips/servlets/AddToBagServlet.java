package com.suptrips.servlets;

import com.suptrips.FactoryDao;
import com.suptrips.Trips;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/auth/AddToBagServlet")
public class AddToBagServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try{
            long idtrip = Long.parseLong((request.getParameter("tobagid").trim()));
            long idbooster = (long) ((HttpServletRequest) request).getSession().getAttribute("idbooster");
            Trips t = new Trips();
            t.setUsers_idboosterId(idbooster);
            t.setUsers_idbooster(FactoryDao.getUsersDao().findUserById(idbooster));
            FactoryDao.getTripsDao().updateTrips(t);

        }catch(NullPointerException e) {
            response.sendRedirect(request.getContextPath() + "/index");
        }
        response.sendRedirect(request.getContextPath() + "/index");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        RequestDispatcher rd = request.getRequestDispatcher("/index");
        rd.forward(request, response);
    }

}
