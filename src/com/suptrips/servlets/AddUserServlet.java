package com.suptrips.servlets;

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
@WebServlet("/auth/addUser")
public class AddUserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException
    {
        String idbooster = request.getParameter("idbooster").trim();
        String password = request.getParameter("password").trim();
        byte[] bytesOfMessage = password.getBytes("UTF-8");

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] thedigest = md.digest(bytesOfMessage);


    }
}
