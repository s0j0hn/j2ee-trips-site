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
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


@WebServlet("/register")
public class AddUserServlet extends HttpServlet {

    public static String hashMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashstring = number.toString(16);

            while (hashstring.length() < 32) {
                hashstring = "0" + hashstring;
            }
            return hashstring;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try{
            Long id = Long.valueOf(request.getParameter("id").trim());
            String campusname = request.getParameter("campusname").trim();
            String password = request.getParameter("password").trim();
            String firstname = request.getParameter("firstname").trim();
            String lastanme = request.getParameter("lastname").trim();
            String email = request.getParameter("email").trim();

            Users newuser = new Users();
            newuser.setIdbooster(id);
            newuser.setCampus_name(campusname);
            newuser.setEmail(email);
            newuser.setFirstname(firstname);
            newuser.setLastname(lastanme);
            newuser.setPassword(hashMD5(password));

            request.setAttribute("users", FactoryDao.getUsersDao().addUser(newuser));
        }catch(NumberFormatException e) {
        }
        HttpSession session = request.getSession();
        response.sendRedirect(request.getContextPath() + "/login");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
        rd.forward(request, response);
    }


}
