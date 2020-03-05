package javaproj.registerlogin;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Test1 {
    JFrame frame;
    JPanel mainpanel;
    JLabel mainlabel;
    Test1()
    {
        frame = new JFrame("Test 1");
        mainlabel = new JLabel("Test 1", JLabel.CENTER);
        
            mainpanel.setLayout(null);
        
        frame.add(mainpanel);
        frame.setSize(800, 600);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-400, dim.height/2-300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
