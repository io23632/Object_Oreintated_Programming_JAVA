package Package01;

import javax.swing.*;

import java.awt.*;

import static java.awt.Color.*;

public class UI {

    JFrame window;
    JPanel titleNamePanel, startButtonPanel;
    JLabel titleNameLabel;
    JButton startButton;

    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 24);

    public void createUI(){
        // Window
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(black);
        window.setLayout(null);

        // TITLE PANEL
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 500);
        titleNamePanel.setBackground(black);
        titleNameLabel = new JLabel("ADVENTURE");
        titleNameLabel.setForeground(white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);


        // Start Button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(black);
        startButton = new JButton("START");
        startButton.setBackground(black);
        startButton.setForeground(magenta);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButtonPanel.add(startButton);

        window.add(titleNamePanel);
        window.add(startButtonPanel);

        window.setVisible(true);
    }
}
