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

public class groupList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try
        {
            Enumeration<String> username = request.getHeaders("username");
            String user = username.nextElement();
            response.setContentType("text/html;charset=UTF-8");
            Connection con = DatabaseConnection.initializeDatabase();
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery("SELECT * FROM grouplist");
            PrintWriter out=response.getWriter();
            while(rst.next()) {
               int groupID = rst.getInt(1);
               String groupName = rst.getString(2);
               String groupDiscription = rst.getString(3);
               out.println("<div class=\"group-drawer\" onclick=\"openchat();displayChat(event);\" id='"+ groupID +"'>");
               out.println("<div class=\"profile-image\" style='pointer-events: none;'>"+ groupName.charAt(0) +"</div>");
               out.println("<div class=\"info\" style='pointer-events: none;'>");
               out.println("<h5 class=\"m-0\"style='pointer-events: none;'>"+ groupName +"</h5>");
               out.println("<p>"+ groupDiscription +"</p>");
               out.println("</div>");
               out.println("</div>");
            }
            con.close();
            out.println("<div class=\"floating-btn\">");
            out.println(" <i id=\"addgroup\" class=\"material-icons\" onclick=\"document.getElementById('create-group').style.display = 'flex';\">add</i>");
            out.println("</div>");
            out.println("<div id=\"create-group\">");
            out.println("<div class=\"heading\">Create New Group</div>");
            out.println("<form class=\"new-group-form\" method=\"post\" action=\"newgroup\">");
            out.println("<h6>Name:</h6>");
            out.println("<input type=\"text\" class=\"form-control\" name=\"groupname\" id=\"groupname\" value=\"\">");
            out.println("<h6>Description:</h6>");
            out.println("<textarea class=\"form-control\" style=\"display: none\" id=\"admin\" name=\"admin\">"+ user +"</textarea>");
            out.println("<textarea class=\"form-control\" id=\"description\" name=\"description\"></textarea>");
            out.println("<input type=\"hidden\" name=\"flag\" value=\""+ user +"\">");
            out.println("<button type=\"submit\" class=\"form-control\" >");
            out.println("<div class=\"btntxt\">submit</div>");
            out.println("</button>");
            out.println("</form>");
            out.println("</div>");
//          <div id="admin" name="admin" style="display: none">"+ user +"</div>
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
