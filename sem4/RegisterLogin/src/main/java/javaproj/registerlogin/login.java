package javaproj.registerlogin;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

public class login {
    JFrame frame;
    JPanel mainpanel;
    JComboBox utype;
    JLabel mainlabel;
    JLabel tlabel;
    JLabel tlabel1;
    JLabel tlabel1Err;
    JTextField t1;
    JLabel tlabel2;
    JPasswordField t2;
    JLabel tlabel3;
    JTextField t3;
    JLabel tlabel4;
    JLabel tlabel5;
    JLabel tlabel6;
    JButton button;
    JButton button1;
    
    login() throws IOException
    {
        frame = new JFrame("Login Form");
        mainlabel = new JLabel("Login", JLabel.CENTER);
        button = new JButton();
        button1 = new JButton();
        mainpanel = new JPanel();
        
            mainpanel.setLayout(null);
            
            mainlabel.setFont(new Font("Serif", Font.BOLD, 30));
            mainlabel.setForeground(new Color(0, 0, 0));
            mainlabel.setBounds(250, 40, 300, 60 );
            Border border = BorderFactory.createLineBorder(new Color(0, 0, 0));
            mainlabel.setBorder(border);
            mainpanel.add(mainlabel);
            
            tlabel1 = new JLabel("User Name :", JLabel.LEFT);
            tlabel1.setBounds(100, 150, 200, 35);
            tlabel1.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel1);
            t1 = new JTextField(16);
            t1.setFont(new Font("Serif", Font.PLAIN, 17));
            t1.setForeground(new Color(50, 50, 50));
            t1.setMargin(new Insets(0, 7, 0, 0));
            t1.setBounds(400, 150, 300, 35);
            mainpanel.add(t1);
            
            tlabel2 = new JLabel("Password :", JLabel.LEFT);
            tlabel2.setBounds(100, 200, 200, 35);
            tlabel2.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel2);
            t2 = new JPasswordField(16);
            t2.setFont(new Font("Serif", Font.PLAIN, 17));
            t2.setForeground(new Color(50, 50, 50));
            t2.setMargin(new Insets(0, 7, 0, 0));
            t2.setBounds(400, 200, 300, 35);
            mainpanel.add(t2);
            
            tlabel3 = new JLabel("User Type :", JLabel.LEFT);
            tlabel3.setBounds(100, 250, 200, 35);
            tlabel3.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel3);
            String ut[] = {"   Admin", "   User"};
            utype = new JComboBox(ut);
            utype.setSelectedIndex(1);
            utype.setBounds(400, 250, 100, 35);
            mainpanel.add(utype);
            
            tlabel4 = new JLabel("Captcha :", JLabel.LEFT);
            tlabel4.setBounds(100, 320, 200, 35);
            tlabel4.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel4);
            t3 = new JTextField(16);
            t3.setFont(new Font("Serif", Font.PLAIN, 17));
            t3.setForeground(new Color(50, 50, 50));
            t3.setMargin(new Insets(0, 7, 0, 0));
            t3.setBounds(400, 320, 100, 35);
            mainpanel.add(t3);
            
            int i = (int)(Math.random() * 4) + 1;
            BufferedImage myPicture = ImageIO.read(new File("src/main/java/javaproj/registerlogin/images/" + i + ".png"));
            String captcha[] = {"89074","03215","44908","94460"};
            tlabel5 = new JLabel(new ImageIcon(myPicture));
            tlabel5.setBounds(550, 300, 150, 60);
            mainpanel.add(tlabel5);
            
            tlabel1Err = new JLabel("", JLabel.LEFT);
            tlabel1Err.setBounds(300, 350, 200, 35);
            tlabel1Err.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel1Err);
            
            button.setText("Clear");
            button.setBounds(100, 420, 200, 40 );
            button.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) { 
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
            });
            mainpanel.add(button);
            
            button1.setText("Login");
            button1.setBounds(500, 420, 200, 40 );
            button1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    try {
                        String dbURL = "jdbc:mysql://localhost:3306/logindetails";
                        String un = "sgr";
                        String pw = "Pass@123";
                        Connection connection = DriverManager.getConnection(dbURL, un, pw);
                        Statement statement = connection.createStatement();
                        if(utype.getSelectedItem().equals("   Admin")) {
                            ResultSet admin = statement.executeQuery(
                            "SELECT * FROM admin ");
                            un = t1.getText();
                            pw = t2.getText();
                            boolean found = false;
                            while(admin.next()) {
                                if(un.equals(admin.getString(2))) {
                                    if(pw.equals(admin.getString(3))) {
                                        found = true;
                                        break;
                                    }
                                }
                            }
                            boolean cap = false;
                            if(captcha[i-1].equals(t3.getText())) cap = true;

                            if(!found) {
                                tlabel1Err.setText("Invalid Credentials");
                            }
                            else if(!cap) {
                                tlabel1Err.setText("Incorrect Captcha");
                            }
                            else {
                                tlabel1Err.setText("");
                                frame.dispose();
                                adminpage AP = new adminpage(un);
                            }
                        }
                        else {
                            un = t1.getText();
                            pw = t2.getText();
                            ResultSet users = statement.executeQuery(
                            "SELECT * FROM users where UserName = '" + un + "' and UserPassword = '" + pw + "'");
                            
                            boolean cap = false;
                            if(captcha[i-1].equals(t3.getText())) cap = true;

                            if(!users.next()) {
                                tlabel1Err.setText("Invalid Credentials");
                            }
                            else if(!cap) {
                                tlabel1Err.setText("Incorrect Captcha");
                            }
                            else {
                                frame.dispose();
                                selecttest ST = new selecttest(users.getString(2));
                            }
                        }
                    } catch(SQLException ex) {
                        for(Throwable t : ex) {
                            System.out.println(t);
                        }
                    }
                }
            });
            mainpanel.add(button1);
            
            tlabel = new JLabel("New user?", JLabel.CENTER);
            tlabel.setForeground(Color.BLUE.darker());
            tlabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            tlabel.setBounds(335, 480, 130, 40);
            tlabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    frame.dispose();
                    register R = new register();
                }
            });
            mainpanel.add(tlabel);
        frame.add(mainpanel);
        frame.setSize(800, 600);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-400, dim.height/2-300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
