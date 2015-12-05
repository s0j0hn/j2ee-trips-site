package com.suptrips.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by root on 02/12/15.
 */
@WebServlet("/register")
public class AddUserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException
    {
        String campusname = request.getParameter("campusname").trim();
        String password = request.getParameter("password").trim();
        String firstname = request.getParameter("firstname").trim();
        String lastanme = request.getParameter("lastname").trim();
        String email = request.getParameter("email").trim();


        byte[] bytesOfMessage = password.getBytes("UTF-8");
        //
        //hash md5
        //
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] thedigest = md.digest(bytesOfMessage);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
        rd.forward(request, response);
    }
}
