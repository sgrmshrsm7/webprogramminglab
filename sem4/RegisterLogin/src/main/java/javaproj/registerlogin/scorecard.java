package javaproj.registerlogin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class scorecard {
    JFrame frame;
    JPanel mainpanel;
    JLabel mainlabel;
    JLabel scorelabel;
    JButton button;
    scorecard(String name, int score)
    {
        frame = new JFrame("Scorecard");
        mainpanel = new JPanel();
        mainlabel = new JLabel("Congratulations " + name + " !!!", JLabel.CENTER);
        scorelabel = new JLabel("You scored " + score + "/25 marks", JLabel.CENTER);
        button = new JButton();
        
            mainpanel.setLayout(null);
            
            mainlabel.setFont(new Font("Serif", Font.BOLD, 28));
            mainlabel.setForeground(new Color(0, 0, 0));
            mainlabel.setBounds(0, 20, 600, 60 );
            mainpanel.add(mainlabel);
            
            scorelabel.setFont(new Font("Serif", Font.BOLD, 28));
            scorelabel.setForeground(new Color(0, 0, 0));
            scorelabel.setBounds(0, 170, 600, 60 );
            mainpanel.add(scorelabel);
            
            button.setText("Go Back");
            button.setBounds(80, 370, 200, 40 );
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    frame.dispose();
                    selecttest a = new selecttest(name);
                }
            } );
            mainpanel.add(button);
            
        frame.add(mainpanel);
        frame.setSize(600, 500);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-300, dim.height/2-250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
