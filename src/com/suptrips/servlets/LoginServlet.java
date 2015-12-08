package com.suptrips.servlets;

import com.suptrips.FactoryDao;
import com.suptrips.Users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by root on 02/12/15.
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("idbooster");
        String pass = request.getParameter("password");
        Users u = FactoryDao.getUsersDao().verifUserPassword(id,pass);
        if ( u.getPassword().equals(pass) && u.getIdbooster().equals(id) ){
            HttpSession session = request.getSession();
            session.setAttribute("password", pass);
            session.setAttribute("idbooster", id);
            response.sendRedirect(request.getContextPath() + "/auth/listTrips");
        }else {
            RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
            rd.forward(request, response);
        }


        //session.setAttribute("password", FactoryDao.getUsersDao().verifUserPassword(password));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
        rd.forward(request, response);
    }

}