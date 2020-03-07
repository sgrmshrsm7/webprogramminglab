package javaproj.registerlogin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Test1 {
    JFrame frame;
    JPanel mainpanel;
    JLabel mainlabel;
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
    JButton button;
    JButton button1;
    String ans1[] = {"28", "5", "12", "54", "30"};
    int score = 0;
    Test1(String name)
    {
        frame = new JFrame("Test 1");
        mainpanel = new JPanel();
        mainlabel = new JLabel("Test 1", JLabel.CENTER);
        button = new JButton();
        button1 = new JButton();
        
            mainpanel.setLayout(null);
            mainlabel.setFont(new Font("Serif", Font.BOLD, 28));
            mainlabel.setForeground(new Color(0, 0, 0));
            mainlabel.setBounds(0, 15, 600, 60 );
            mainpanel.add(mainlabel);
        
            tlabel1 = new JLabel("Question 1          25 + 3     = ", JLabel.LEFT);
            tlabel1.setBounds(100, 100, 300, 35);
            tlabel1.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel1);
            t1 = new JTextField("");
            t1.setFont(new Font("Serif", Font.PLAIN, 17));
            t1.setForeground(new Color(50, 50, 50));
            t1.setMargin(new Insets(0, 7, 0, 0));
            t1.setBounds(400, 100, 50, 35);
            mainpanel.add(t1);
            
            tlabel2 = new JLabel("Question 2          35 / 7     = ", JLabel.LEFT);
            tlabel2.setBounds(100, 150, 300, 35);
            tlabel2.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel2);
            t2 = new JTextField("");
            t2.setFont(new Font("Serif", Font.PLAIN, 17));
            t2.setForeground(new Color(50, 50, 50));
            t2.setMargin(new Insets(0, 7, 0, 0));
            t2.setBounds(400, 150, 50, 35);
            mainpanel.add(t2);
            
            tlabel3 = new JLabel("Question 3          14 - 2     = ", JLabel.LEFT);
            tlabel3.setBounds(100, 200, 300, 35);
            tlabel3.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel3);
            t3 = new JTextField("");
            t3.setFont(new Font("Serif", Font.PLAIN, 17));
            t3.setForeground(new Color(50, 50, 50));
            t3.setMargin(new Insets(0, 7, 0, 0));
            t3.setBounds(400, 200, 50, 35);
            mainpanel.add(t3);
            
            tlabel4 = new JLabel("Question 4          27 * 2     = ", JLabel.LEFT);
            tlabel4.setBounds(100, 250, 300, 35);
            tlabel4.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel4);
            t4 = new JTextField("");
            t4.setFont(new Font("Serif", Font.PLAIN, 17));
            t4.setForeground(new Color(50, 50, 50));
            t4.setMargin(new Insets(0, 7, 0, 0));
            t4.setBounds(400, 250, 50, 35);
            mainpanel.add(t4);
            
            tlabel5 = new JLabel("Question 5          21 + 9     = ", JLabel.LEFT);
            tlabel5.setBounds(100, 300, 300, 35);
            tlabel5.setFont(new Font("Serif", Font.BOLD, 18));
            mainpanel.add(tlabel5);
            t5 = new JTextField("");
            t5.setFont(new Font("Serif", Font.PLAIN, 17));
            t5.setForeground(new Color(50, 50, 50));
            t5.setMargin(new Insets(0, 7, 0, 0));
            t5.setBounds(400, 300, 50, 35);
            mainpanel.add(t5);
            
            button.setText("Submit");
            button.setBounds(300, 370, 200, 40 );
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if(t1.getText().equals(ans1[0]))
                        score = score + 5;
                    if(t2.getText().equals(ans1[1]))
                        score = score + 5;
                    if(t3.getText().equals(ans1[2]))
                        score = score + 5;
                    if(t4.getText().equals(ans1[3]))
                        score = score + 5;
                    if(t5.getText().equals(ans1[4]))
                        score = score + 5;
                    frame.dispose();
                    scorecard sc = new scorecard(name, score);
                }
            } );
            mainpanel.add(button);
            
            button1.setText("Go Back");
            button1.setBounds(80, 370, 200, 40 );
            button1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    frame.dispose();
                    selecttest a = new selecttest(name);
                }
            } );
            mainpanel.add(button1);
            
        frame.add(mainpanel);
        frame.setSize(600, 500);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-300, dim.height/2-250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
