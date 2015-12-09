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

        String newpassword = request.getParameter("newpassword").trim();
        String firstname = request.getParameter("newfirstname").trim();
        String lastanme = request.getParameter("newlastname").trim();
        String email = request.getParameter("newemail").trim();
        long id = Long.parseLong(request.getParameter("idbooster"));
        Users u = FactoryDao.getUsersDao().findUserById(id);
        u.setEmail(email);
        u.setFirstname(firstname);
        u.setLastname(lastanme);
        u.setPassword(newpassword);
        FactoryDao.getUsersDao().updateUsers(u);
        response.sendRedirect(request.getContextPath() + "/auth/updateuser");
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            long id = (long) ((HttpServletRequest) request).getSession().getAttribute("idbooster");

            request.setAttribute("users", FactoryDao.getUsersDao().findUserById(id));
            RequestDispatcher rd = request.getRequestDispatcher("/auth/updateuser.jsp");
            rd.forward(request, response);

        }catch(NumberFormatException e) {
            //	out.println("Incorrect format");
        }

    }
}
