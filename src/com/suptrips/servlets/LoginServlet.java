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
        long id = Long.parseLong(request.getParameter("idbooster"));
        String pass = request.getParameter("password");
        String passmd5 = AddUserServlet.hashMD5(pass);
        Users u = FactoryDao.getUsersDao().verifUserPassword(id,passmd5);
        if ( u.getPassword().equals(pass) && u.getIdbooster() == id ){
            HttpSession session = request.getSession();
            session.setAttribute("password", passmd5);
            session.setAttribute("idbooster", id);
            response.sendRedirect(request.getContextPath() + "/auth/listTrips");
        }else {
            RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
            rd.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
        rd.forward(request, response);
    }

}