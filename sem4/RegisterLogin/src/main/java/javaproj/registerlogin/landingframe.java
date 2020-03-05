package javaproj.registerlogin;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class landingframe {
    JFrame frame;
    JPanel mainpanel;
    JLabel mainlabel;
    JLabel crslabel;
    JLabel tlabel;
    JButton button;
    JButton button1;
    
    landingframe() throws IOException
    {
        frame = new JFrame("Welcome Page");
        mainlabel = new JLabel("Welcome", JLabel.CENTER);
        crslabel = new JLabel("VNIT Test Series", JLabel.CENTER);
        tlabel = new JLabel();
        button = new JButton();
        button1 = new JButton();
        mainpanel = new JPanel();
        
            mainpanel.setLayout(null);
            
            mainlabel.setFont(new Font("Serif", Font.BOLD, 30));
            mainlabel.setForeground(new Color(0, 0, 0));
            mainlabel.setBounds(100, 50, 600, 60 );
            Border border = BorderFactory.createLineBorder(new Color(0, 0, 0));
            mainlabel.setBorder(border);
            mainpanel.add(mainlabel);
            
            crslabel.setFont(new Font("Serif", Font.BOLD, 30));
            crslabel.setForeground(new Color(0, 0, 0));
            crslabel.setBounds(100, 120, 600, 60 );
            mainpanel.add(crslabel);
            
            button.setText("Register");
            button.setBounds(100, 350, 200, 40 );
            button.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                register R = new register();
            }
            });
            mainpanel.add(button);
            
            button1.setText("Login");
            button1.setBounds(100, 270, 200, 40 );
            button1.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                    try {
                        login LI = new login();
                    } catch (IOException ex) {
                        Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            });
            mainpanel.add(button1);
            
            BufferedImage myPicture = ImageIO.read(new File("src/main/java/javaproj/registerlogin/images/pen.png"));
            tlabel = new JLabel(new ImageIcon(myPicture));
            tlabel.setBounds(0, 0, 800, 600);
            mainpanel.add(tlabel);
            
        frame.add(mainpanel);
        frame.setSize(800, 600);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-400, dim.height/2-300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
