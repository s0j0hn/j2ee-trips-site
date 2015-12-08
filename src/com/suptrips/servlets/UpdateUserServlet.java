package com.suptrips.servlets;

import com.suptrips.FactoryDao;
import com.suptrips.Users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/auth/updateuser")
public class UpdateUserServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String newpassword = request.getParameter("newpassword").trim();
        String firstname = request.getParameter("newfirstname").trim();
        String lastanme = request.getParameter("newlastname").trim();
        String email = request.getParameter("newemail").trim();
        Users u = FactoryDao.getUsersDao().findUserById((request.getParameter("idbooster")));
        u.setEmail(email);
        u.setFirstname(firstname);
        u.setLastname(lastanme);
        u.setPassword(newpassword);
        response.sendRedirect(request.getContextPath() + "/userprofile");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
        rd.forward(request, response);
    }
}
