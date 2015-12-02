package com.suptrips;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by root on 02/12/15.
 */
@WebServlet("/auth/addTrip")
public class AddTripServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException
    {
        String idbooster = request.getParameter("idbo").trim();
        String departcampus = request.getParameter("depart_campus").trim();
        String arrivecampus = request.getParameter("arrive_campus").trim();
        String arrivedate = request.getParameter("arrive_date").trim();


    }
}
