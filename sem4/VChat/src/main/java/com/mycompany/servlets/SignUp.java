package com.mycompany.servlets;
import java.io.*;

import com.mycompany.data.signUpDetails;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/newsignUp")
public class SignUp extends HttpServlet {

        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
            String pageRedirect = null;
            
            try {
                String _username = request.getParameter("username");
                String _email = request.getParameter("email");
                String _password = request.getParameter("password");
                signUpDetails sd = new signUpDetails(_username,_email,_password);
                pageRedirect = "index.jsp";
            } 
            catch (ClassNotFoundException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }

            response.sendRedirect(pageRedirect);
           
	}	

}

