package com.mycompany.servlets;

import com.mycompany.data.DatabaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getMembers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try
        {
            response.setContentType("text/html;charset=UTF-8");
            Enumeration<String> groupid = request.getHeaders("groupid");
            String id = groupid.nextElement();
            Connection con = DatabaseConnection.initializeDatabase();
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery("SELECT username FROM group"+ id);
            PrintWriter out=response.getWriter();
            Enumeration<String> username = request.getHeaders("username");
            String user = username.nextElement();
            ArrayList<String> list = new ArrayList<String>();
            while(rst.next()) {
                String name = rst.getString(1);
                if(!list.contains(name)){
                    list.add(name);
                }
            }
            for(String s : list){
                out.println("<div class=\"member d-flex align-items-center\">");
                out.println("<div class=\"profile-image small\">"+ s.toUpperCase().charAt(0) +"</div>");
                out.println("<h6 class=\"m-0 text-secondary\">"+ s +"</h6>");
                out.println("</div>"); 
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
