package com.mycompany.data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;

public class chat {
    private boolean userFound;
    private boolean adminFound;
    public chat(String _username,String _message,String _id) throws SQLException, ClassNotFoundException, ServletException {
        try {
            Connection con = DatabaseConnection.initializeDatabase();
            Statement stmt = con.createStatement();
            
            String uname = _username;
            String msg = _message;
            Date date=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
            SimpleDateFormat sdf2=new SimpleDateFormat("HH:mm");
            String emtDate=sdf.format(date);
            String emttime=sdf2.format(date);
           // INSERT INTO 'newdb'.'chat' ('username', 'message', 'date', 'time') VALUES ('wer', 'asd', 'das', 'ads');
    //        "INSERT INTO 'time_entry'(pid,tid,rid,tspend,description) VALUE ('"+pid+"','"+tid+"','"+rid+"',"+tspent+",'"+des+"')");
            String str="INSERT INTO group"+ _id +" (username, message, date, time) VALUES ('"+uname+"','"+msg+"','"+emtDate+"','"+emttime+"')";


            int rows = stmt.executeUpdate(str);
        
        }
        catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException("Login failed", ex);
        }
    }
    
 
}
    
