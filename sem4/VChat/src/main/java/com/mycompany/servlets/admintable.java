package com.mycompany.servlets;
import com.mycompany.data.DatabaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class admintable extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
            response.setContentType("text/html;charset=UTF-8");
            Connection con = DatabaseConnection.initializeDatabase();
            Statement stmt = con.createStatement();
            PrintWriter out=response.getWriter();
            ResultSet rst = stmt.executeQuery("SELECT * FROM logindetailsuser");
            out.println("<tr>\n" +"<th>User ID</th>\n" +"<th>Email</th>\n" +"<th>Delete User</th>\n" +"</tr>");
            while(rst.next()) {
               String uid=rst.getString(2);
               String email=rst.getString(3);
              
               out.println("<tr>");
               out.println("<td>" + uid + "</td>");
               out.println("<td>" + email + "</td>");
               out.println("<td><div class=\"deletebutton\" onclick=\"deletefunction('" + uid + "');\"><div class=\"deletebtntxt\">Delete</div></div></td>");
               out.println("</tr>");
               
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
