package javaproj.registerlogin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class selecttest {
    JFrame frame;
    JPanel mainpanel;
    JLabel mainlabel;
    JButton button;
    JButton button1;
    JButton button2;
    
    selecttest(String name)
    {
        frame = new JFrame("Welcome User");
        mainpanel = new JPanel();
        mainlabel = new JLabel("Welcome " + name, JLabel.CENTER);
        button = new JButton();
        button1 = new JButton();
        button2 = new JButton();
        
            mainpanel.setLayout(null);
            mainlabel.setFont(new Font("Serif", Font.BOLD, 28));
            mainlabel.setForeground(new Color(0, 0, 0));
            mainlabel.setBounds(0, 50, 600, 60 );
            mainpanel.add(mainlabel);
            
            button.setText("Test 1");
            button.setBounds(150, 180, 300, 40 );
            button.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Test1 test1 = new Test1(name);
            }
            });
            mainpanel.add(button);
            
            button1.setText("Test 2");
            button1.setBounds(150, 300, 300, 40 );
            button1.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Test2 test2 = new Test2(name);
            }
            });
            mainpanel.add(button1);
            
            button2.setText("Logout");
            button2.setBounds(500, 20, 90, 30);
            button2.addActionListener(new ActionListener() { 
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
            mainpanel.add(button2);
            
        frame.add(mainpanel);
        frame.setSize(600, 500);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-300, dim.height/2-250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
