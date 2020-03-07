package javaproj.registerlogin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.Border;

public class adminpage {
    JFrame frame;
    JScrollPane mainpanel;
    JLabel mainlabel;
    JLabel userData;
    JLabel tErr;
    JTextField t;
    JButton button;
    JButton button1;
    adminpage(String name){
        frame = new JFrame("Welcome Admin");
        mainpanel = new JScrollPane();
        mainlabel = new JLabel("Welcome " + name, JLabel.CENTER);
        button = new JButton();
        button1 = new JButton();
            mainpanel.setLayout(null);
            mainlabel.setFont(new Font("Serif", Font.BOLD, 28));
            mainlabel.setForeground(new Color(0, 0, 0));
            mainlabel.setBounds(0, 30, 800, 60 );
            mainpanel.add(mainlabel);
            
                    try {
                        String dbURL = "jdbc:mysql://localhost:3306/logindetails";
                        String un = "sgr";
                        String pw = "Pass@123";
                        Connection connection = DriverManager.getConnection(dbURL, un, pw);
                        Statement statement = connection.createStatement();
                        ResultSet users = statement.executeQuery(
                            "SELECT * FROM users");
                        
                        Border border = BorderFactory.createLineBorder(new Color(0, 0, 0));
                            
                        userData = new JLabel("UserFullName", JLabel.CENTER);
                        userData.setBounds(50, 100, 120, 50);
                        userData.setFont(new Font("Serif", Font.BOLD, 15));
                        userData.setBorder(border);
                        mainpanel.add(userData);

                        userData = new JLabel("UserName", JLabel.CENTER);
                        userData.setBounds(170, 100, 120, 50);
                        userData.setFont(new Font("Serif", Font.BOLD, 15));
                        userData.setBorder(border);
                        mainpanel.add(userData);

                        userData = new JLabel("UserEmailId", JLabel.CENTER);
                        userData.setBounds(290, 100, 200, 50);
                        userData.setFont(new Font("Serif", Font.BOLD, 15));
                        userData.setBorder(border);
                        mainpanel.add(userData);

                        userData = new JLabel("UserPhoneNo", JLabel.CENTER);
                        userData.setBounds(490, 100, 120, 50);
                        userData.setFont(new Font("Serif", Font.BOLD, 15));
                        userData.setBorder(border);
                        mainpanel.add(userData);

                        userData = new JLabel("UserPassword", JLabel.CENTER);
                        userData.setBounds(610, 100, 120, 50);
                        userData.setFont(new Font("Serif", Font.BOLD, 15));
                        userData.setBorder(border);
                        mainpanel.add(userData);
                        
                        int i = 150;
                        while(users.next()) {
                            userData = new JLabel(users.getString(1), JLabel.CENTER);
                            userData.setBounds(50, i, 120, 50);
                            userData.setFont(new Font("Serif", Font.PLAIN, 14));
                            userData.setBorder(border);
                            mainpanel.add(userData);
                            
                            userData = new JLabel(users.getString(2), JLabel.CENTER);
                            userData.setBounds(170, i, 120, 50);
                            userData.setFont(new Font("Serif", Font.PLAIN, 14));
                            userData.setBorder(border);
                            mainpanel.add(userData);
                            
                            userData = new JLabel(users.getString(3), JLabel.CENTER);
                            userData.setBounds(290, i, 200, 50);
                            userData.setFont(new Font("Serif", Font.PLAIN, 14));
                            userData.setBorder(border);
                            mainpanel.add(userData);
                            
                            userData = new JLabel(users.getString(4), JLabel.CENTER);
                            userData.setBounds(490, i, 120, 50);
                            userData.setFont(new Font("Serif", Font.PLAIN, 14));
                            userData.setBorder(border);
                            mainpanel.add(userData);
                            
                            userData = new JLabel(users.getString(5), JLabel.CENTER);
                            userData.setBounds(610, i, 120, 50);
                            userData.setFont(new Font("Serif", Font.PLAIN, 14));
                            userData.setBorder(border);
                            mainpanel.add(userData);
                            
                            i = i + 50;
                        }
                    } catch(SQLException ex) {
                        for(Throwable t : ex) {
                            System.out.println(t);
                        }
                    }
                    userData = new JLabel("UserName : ");
                    userData.setBounds(100, 470, 150, 35);
                    userData.setFont(new Font("Serif", Font.BOLD, 17));
                    mainpanel.add(userData);
                    
                    t = new JTextField(16);
                    t.setFont(new Font("Serif", Font.PLAIN, 17));
                    t.setForeground(new Color(50, 50, 50));
                    t.setMargin(new Insets(0, 7, 0, 0));
                    t.setBounds(260, 470, 300, 35);
                    mainpanel.add(t);
                    
                    tErr = new JLabel("");
                    tErr.setBounds(260, 507, 300, 35);
                    tErr.setFont(new Font("Serif", Font.BOLD, 15));
                    mainpanel.add(tErr);
                    
                    button.setText("Delete");
                    button.setBounds(580, 470, 100, 35);
                    button.addActionListener(new ActionListener() { 
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        try {
                            String dbURL = "jdbc:mysql://localhost:3306/logindetails";
                            String un = "sgr";
                            String pw = "Pass@123";

                            Connection connection = DriverManager.getConnection(dbURL, un, pw);
                            Statement statement = connection.createStatement();
                            ResultSet users = statement.executeQuery(
                            "SELECT * FROM users " + 
                            "WHERE UserName = '" + t.getText() + "'");
                            boolean unExists = users.next();

                            if(unExists) {
                                String query = 
                                    "DELETE FROM users WHERE UserName = '" + t.getText() + "'";
                                int rowCount  = statement.executeUpdate(query);
                                frame.dispose();
                                adminpage LF = new adminpage(name);
                            }
                            else tErr.setText("UserName not found");
                            
                        } catch(SQLException ex) {
                            for(Throwable t : ex) {
                                System.out.println(t);
                            }
                        } 
                        
                    }
                    });
                    mainpanel.add(button);
                    
                    button1.setText("Logout");
                    button1.setBounds(700, 20, 90, 30);
                    button1.addActionListener(new ActionListener() { 
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        try {
                            landingframe LF = new landingframe();
                        } catch (IOException ex) {
                            Logger.getLogger(selecttest.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    });
                    mainpanel.add(button1);
                    
        frame.add(mainpanel);
        frame.setSize(800, 600);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-400, dim.height/2-300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
