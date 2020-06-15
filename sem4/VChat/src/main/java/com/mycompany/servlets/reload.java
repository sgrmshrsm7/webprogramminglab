package com.mycompany.servlets;



import com.mycompany.data.DatabaseConnection;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;




import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class reload extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try
        {
            response.setContentType("text/html;charset=UTF-8");
            Connection con = DatabaseConnection.initializeDatabase();

            Enumeration<String> groupid = request.getHeaders("groupid");
            String id = groupid.nextElement();
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery("SELECT * FROM group"+ id);
           
            while(rst.next()) {
               String uname=rst.getString(2);
               String msg=rst.getString(3);
               String date=rst.getString(4);
               String time=rst.getString(5);
               PrintWriter out=response.getWriter();
               Enumeration<String> username = request.getHeaders("username");
               String user = username.nextElement();
               if(user.equals(uname)){
                    out.println("<div class=\"message right\">");
                    out.println("<p class='m-0'>"+ msg +"</p>");
                    out.println("<p style='font-size:12px;color:#999;margin:0;' align='right'>"+ time +"</p>");
                    out.println("</div>");
               }else{
                    out.println("<div class='message left'>");
                    out.println("<b style='font-size:14px;'>"+ uname +"</b>");
                    out.println("<p class='m-0'>"+ msg +"</p>");
                    out.println("<p style='font-size:12px;color:#999;margin:0;' align='right'>"+ time +"</p>");
                    out.println("</div>");
               }
               
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
