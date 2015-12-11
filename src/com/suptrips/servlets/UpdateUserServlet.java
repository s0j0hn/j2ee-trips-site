package com.suptrips.servlets;

import com.suptrips.FactoryDao;
import com.suptrips.Users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/auth/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String newpassword = request.getParameter("password").trim();
        String firstname = request.getParameter("firstname").trim();
        String lastanme = request.getParameter("lastname").trim();
        String email = request.getParameter("email").trim();
        long id = (long) ((HttpServletRequest) request).getSession().getAttribute("idbooster");
        Users u = FactoryDao.getUsersDao().findUserById(id);
        u.setEmail(email);
        u.setFirstname(firstname);
        u.setLastname(lastanme);
        u.setPassword(AddUserServlet.hashMD5(newpassword));
        FactoryDao.getUsersDao().updateUsers(u);
        response.sendRedirect(request.getContextPath() + "/auth/updateuser");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            long id = (long) ((HttpServletRequest) request).getSession().getAttribute("idbooster");
            request.setAttribute("users", FactoryDao.getUsersDao().findUserById(id));
            RequestDispatcher rd = request.getRequestDispatcher("/auth/updateuser.jsp");
            rd.forward(request, response);

        } catch (NumberFormatException e) {
            //	out.println("Incorrect format");
        }
    }

}
