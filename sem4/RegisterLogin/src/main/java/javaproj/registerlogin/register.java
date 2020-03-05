package javaproj.registerlogin;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;

public class register {
    JFrame frame;
    JPanel mainpanel;
    JLabel mainlabel;
    JLabel tlabel;
    JLabel tlabel1;
    JTextField t1;
    JLabel tlabel2;
    JTextField t2;
    JLabel tlabel3;
    JTextField t3;
    JLabel tlabel4;
    JTextField t4;
    JLabel tlabel5;
    JTextField t5;
    JLabel tlabel6;
    JTextField t6;
    JButton button;
    JButton button1;
    
    register()
    {
        frame = new JFrame("Registration Form");
        mainlabel = new JLabel("Register", JLabel.CENTER);
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
            
            tlabel1 = new JLabel("Full Name :", JLabel.LEFT);
            tlabel1.setBounds(100, 150, 200, 35);
            tlabel1.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel1);
            t1 = new JTextField("");
            t1.setFont(new Font("Serif", Font.PLAIN, 17));
            t1.setForeground(new Color(50, 50, 50));
            t1.setMargin(new Insets(0, 7, 0, 0));
            t1.setBounds(400, 150, 300, 35);
            mainpanel.add(t1);
            
            tlabel2 = new JLabel("User Name :", JLabel.LEFT);
            tlabel2.setBounds(100, 200, 200, 35);
            tlabel2.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel2);
            t2 = new JTextField(16);
            t2.setFont(new Font("Serif", Font.PLAIN, 17));
            t2.setForeground(new Color(50, 50, 50));
            t2.setMargin(new Insets(0, 7, 0, 0));
            t2.setBounds(400, 200, 300, 35);
            mainpanel.add(t2);
            
            tlabel3 = new JLabel("Email :", JLabel.LEFT);
            tlabel3.setBounds(100, 250, 200, 35);
            tlabel3.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel3);
            t3 = new JTextField(16);
            t3.setFont(new Font("Serif", Font.PLAIN, 17));
            t3.setForeground(new Color(50, 50, 50));
            t3.setMargin(new Insets(0, 7, 0, 0));
            t3.setBounds(400, 250, 300, 35);
            mainpanel.add(t3);
            
            tlabel4 = new JLabel("Phone Number :", JLabel.LEFT);
            tlabel4.setBounds(100, 300, 200, 35);
            tlabel4.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel4);
            t4 = new JTextField(16);
            t4.setFont(new Font("Serif", Font.PLAIN, 17));
            t4.setForeground(new Color(50, 50, 50));
            t4.setMargin(new Insets(0, 7, 0, 0));
            t4.setBounds(400, 300, 300, 35);
            mainpanel.add(t4);
            
            tlabel5 = new JLabel("Password :", JLabel.LEFT);
            tlabel5.setBounds(100, 350, 200, 35);
            tlabel5.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel5);
            t5 = new JTextField(16);
            t5.setFont(new Font("Serif", Font.PLAIN, 17));
            t5.setForeground(new Color(50, 50, 50));
            t5.setMargin(new Insets(0, 7, 0, 0));
            t5.setBounds(400, 350, 300, 35);
            mainpanel.add(t5);
            
            tlabel6 = new JLabel("Confirm Password :", JLabel.LEFT);
            tlabel6.setBounds(100, 400, 200, 35);
            tlabel6.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel6);
            t6 = new JTextField(16);
            t6.setFont(new Font("Serif", Font.PLAIN, 17));
            t6.setForeground(new Color(50, 50, 50));
            t6.setMargin(new Insets(0, 7, 0, 0));
            t6.setBounds(400, 400, 300, 35);
            mainpanel.add(t6);
            
            button.setText("Clear");
            button.setBounds(100, 480, 200, 40 );
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                }
            } );
            mainpanel.add(button);
            
            button1.setText("Register");
            button1.setBounds(500, 480, 200, 40 );
            button1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    
                }
            });
            mainpanel.add(button1);
            
            tlabel = new JLabel("Already a user?", JLabel.CENTER);
            tlabel.setForeground(Color.BLUE.darker());
            tlabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            tlabel.setBounds(335, 515, 130, 40);
            tlabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    frame.dispose();
                    try {
                        login LI = new login();
                    } catch (IOException ex) {
                        Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
                    }
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
