package com.mycompany.servlets;
import com.mycompany.data.formgroup;
import java.io.*;

import com.mycompany.data.signUpDetails;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

public class newgroup extends HttpServlet {

        @Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
            String pageRedir = null;
            
            try {
               // String userName = (String)session.getAttribute("username");
                String admin=request.getParameter("admin");
                String groupname = request.getParameter("groupname");
                String description = request.getParameter("description");
               
                formgroup sd = new formgroup(admin,groupname,description);
                 pageRedir =  "welcomepage.jsp";
                
            } 
            catch (ClassNotFoundException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }

            response.sendRedirect(pageRedir);
           
	}	

}

