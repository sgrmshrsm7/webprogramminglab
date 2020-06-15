package com.mycompany.servlets;

import com.mycompany.data.chat;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class chatstore extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        try
        {
            response.setContentType("text/html;charset=UTF-8");
        
            String uname=request.getParameter("uname");
            String msg=request.getParameter("msg");
            String id=request.getParameter("id");
            chat ID = new chat(uname,msg,id);
  
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Invalid user");
        }
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
