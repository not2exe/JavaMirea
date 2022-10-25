package ru.mirea.practices.pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Match extends JFrame {
    int acCounter = 0, rmCounter = 0;
    String[] winner = {Constants.DRAW, Constants.AC_MILAN, Constants.REAL_MADRID};
    int winnerId = 0;

    JButton buttonACMilan = new JButton(Constants.AC_MILAN);
    JButton buttonRM = new JButton(Constants.REAL_MADRID);
    JLabel labelCenter = new JLabel("Result: " + acCounter + " X " + rmCounter);
    JLabel labelSecond = new JLabel("Last Scorer: " + "N/A");
    Label labelWinner = new Label("Winner: " + winner[winnerId]);

    public Match() {
        super(Constants.AC_MILAN + " | " + Constants.REAL_MADRID);
        initLayout();
        initViews();
        initButtons();
    }

    private void initLayout() {
        setSize(1280, 720);
        setLayout(new BorderLayout());
    }

    private void initViews() {
        add(buttonACMilan, BorderLayout.WEST);
        add(buttonRM, BorderLayout.EAST);
        add(labelCenter, BorderLayout.CENTER);
        add(labelSecond, BorderLayout.NORTH);
        add(labelWinner, BorderLayout.SOUTH);

        labelSecond.setHorizontalAlignment(JLabel.CENTER);
        labelCenter.setHorizontalAlignment(JLabel.CENTER);
        labelWinner.setAlignment(Label.CENTER);

        buttonRM.setBackground(Color.cyan);
        buttonACMilan.setBackground(Color.cyan);

    }
    private void checkDraw(){
        if (rmCounter == acCounter) {
            buttonRM.setBackground(Color.cyan);
            buttonACMilan.setBackground(Color.cyan);
            winnerId = 0;
        }
    }

    private void initButtons() {

        buttonACMilan.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                acCounter += 1;
                labelCenter.setText("Result: " + acCounter + " X " + rmCounter);
                labelSecond.setText("Last Scorer: " + Constants.AC_MILAN);

                if (acCounter - rmCounter > 0) {
                    buttonACMilan.setBackground(Color.GREEN);
                    buttonRM.setBackground(Color.RED);
                    winnerId = 1;
                }
                checkDraw();

                labelWinner.setText("Winner: " + winner[winnerId]);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }


        });
        buttonRM.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                rmCounter += 1;
                labelCenter.setText("Result: " + acCounter + " X " + rmCounter);
                labelSecond.setText("Last Scorer: " + Constants.REAL_MADRID);
                if (rmCounter - acCounter > 0) {
                    winnerId = 2;
                    buttonRM.setBackground(Color.GREEN);
                    buttonACMilan.setBackground(Color.RED);
                }
                checkDraw();
                labelWinner.setText("Winner: " + winner[winnerId]);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }
}