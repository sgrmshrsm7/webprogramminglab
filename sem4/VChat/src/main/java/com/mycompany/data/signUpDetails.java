package com.mycompany.data;

import com.mycompany.data.md5;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;

public class signUpDetails {
    public signUpDetails(String _username,String _email,String _password) throws ServletException 
            , ClassNotFoundException {
        try {
            Connection con = DatabaseConnection.initializeDatabase();
            Statement stmt = con.createStatement();
            
            String salted = _username+"chatWith"+_password+"Me";
            String md5hash = md5.getMd5(salted);
            
            String query = "INSERT INTO logindetailsuser( hashId, userId, emailId, password)" +
                   "VALUES ('" + md5hash + "'," +
                            "'" + _username + "'," +
                            "'" + _email + "'," +
                            "'" + _password + "')";
            int rowCount = stmt.executeUpdate(query);
            
        }
        catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException("Signup failed", ex);
        }
    }
}
