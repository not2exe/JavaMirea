package ru.mirea.labs.lab5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;


public class ShowImage extends JFrame {
    private final JLabel imgLabel;
    private int imgNum = 1;

    ShowImage(){
        this.setSize(315, 312);
        imgLabel = new JLabel("", new ImageIcon(Objects.requireNonNull(getClass().getResource("1.png"))), SwingConstants.CENTER);
        getContentPane().add(imgLabel);
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imgLabel.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource((++imgNum) + ".png"))));
                if(imgNum == 2) imgNum = 0;
            }
        });
        timer.setRepeats(true);
        timer.start();
    }
}