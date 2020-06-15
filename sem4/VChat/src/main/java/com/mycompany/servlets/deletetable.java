package com.mycompany.servlets;
import com.mycompany.data.DatabaseConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class deletetable extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try
        {
            response.setContentType("text/html;charset=UTF-8");
            Connection con = DatabaseConnection.initializeDatabase();
            Statement stmt = con.createStatement();
            Enumeration<String> uid = request.getHeaders("userid");
            String id = uid.nextElement();
            int rowCount = stmt.executeUpdate("DELETE FROM logindetailsuser where userId = '" + id + "'");
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
