package com.suptrips.servlets;

import com.suptrips.FactoryDao;

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
        String idbooster = request.getParameter("idbooster").trim();
        String password = request.getParameter("password").trim();
        HttpSession session = request.getSession();
        session.setAttribute("idbooster", FactoryDao.getUsersDao().findUserById(idbooster));
        session.setAttribute("password", FactoryDao.getUsersDao().verifUserPassword(password));
        response.sendRedirect(request.getContextPath() + "/auth/listTrips");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
        rd.forward(request, response);
    }

}