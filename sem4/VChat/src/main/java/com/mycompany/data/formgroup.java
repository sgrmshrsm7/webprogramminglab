package com.mycompany.data;

import com.mycompany.data.md5;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;

public class formgroup {
    public formgroup(String admin,String groupname,String desc) throws ServletException 
            , ClassNotFoundException {
        try {
            Connection con = DatabaseConnection.initializeDatabase();
            Statement stmt = con.createStatement();
            String id="0";
     
            
            String query = "INSERT INTO grouplist( name,discription,admin)" +
                   "VALUES ('" + groupname + "'," +
                            "'" + desc + "'," +
                            "'" + admin + "')";
            int rowCount = stmt.executeUpdate(query);
           ResultSet userDetails = stmt.executeQuery("SELECT * FROM grouplist");
           while(userDetails.next()) {
                id=userDetails.getString(1);
            }
           
            String query2="CREATE TABLE group"+id+"(" +
                "idchat INT NOT NULL AUTO_INCREMENT," + "username VARCHAR(45) NULL," +
                "message VARCHAR(100) NULL," +
                "date VARCHAR(45) NULL," +
                "time VARCHAR(45) NULL," +
                "PRIMARY KEY (idchat))";
            int rowCo =stmt.executeUpdate(query2);
        }
        catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException("Signup failed", ex);
        }
       
    }
}
