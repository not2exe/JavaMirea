package ru.mirea.labs.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.util.Vector;

public class GuessGame extends JFrame {
    private final Vector<Number> nums = new Vector<>();
    private int tries = 3;
    private final JPanel centralPanel = new JPanel(new GridLayout(2, 10));
    private final JLabel messageNorthLabel = new JLabel("Try to guess a number");
    private final JLabel messageSouthLabel = new JLabel("Number of attempts: " + tries);
    private final Random random = new Random();
    public class Number {
        private static int guessedNum;
        private final int id;
        private final Button textId;
        private final Font fontSmall = new Font("Times new roman", Font.BOLD, 32);

        MouseAdapter ma = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (id == guessedNum) {
                    Number.this.textId.setForeground(new Color(0, 175, 0));
                    Number.this.textId.setBackground(new Color(0, 125, 0));
                    messageSouthLabel.setText("You right! It's " + guessedNum);
                    stop();
                }
                else {
                    String msg ="";
                    if (id < guessedNum) {
                        msg = "The guessed number is greater than the chosen one";
                    }
                    else {
                        msg  = "The guessed number is lower than the chosen one";

                    }
                    messageNorthLabel.setText(msg);
                    Number.this.textId.setFont(fontSmall);
                    tries--;
                    if (tries == 0) {
                        messageNorthLabel.setText("=(");
                        messageSouthLabel.setText("You lose! It was number " + guessedNum);
                        stop();
                        return;
                    }
                    messageSouthLabel.setText("Number of attempts: " + tries);
                }
            }
        };
        Number(int numId) {
            id = numId;
            textId = new Button(String.valueOf(id));
            textId.setFont(fontSmall);
            textId.addMouseListener(ma);
            centralPanel.add(textId);
            nums.add(this);
        }
    }
    public GuessGame() {
        initLayout();
    }
    public void initLayout(){
        Font font = new Font("Times new roman", Font.BOLD, 64);
        messageSouthLabel.setFont(font);
        JPanel southPanel = new JPanel();
        southPanel.add(messageSouthLabel);
        JFrame frame = new JFrame("Guesser");
        frame.setSize(1920, 960);
        frame.setLayout(new BorderLayout());
        JPanel northPanel = new JPanel();
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(centralPanel, BorderLayout.CENTER);
        frame.add(southPanel, BorderLayout.SOUTH);
        northPanel.add(messageNorthLabel);
        messageNorthLabel.setHorizontalAlignment(JLabel.CENTER);
        messageNorthLabel.setFont(font);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (int i = 1; i <= 20; i++)
            new Number(i);
        Number.guessedNum = Math.abs(random.nextInt())%20+1;
        frame.setVisible(true);
    }
    public void stop() {
        for (Number num : nums) {
            num.textId.setFocusable(false);
            num.textId.removeMouseListener(num.ma);
        }
    }
}
