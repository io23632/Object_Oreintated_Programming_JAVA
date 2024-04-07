package org.example;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;

public class Main {

    JFrame window;
    // Container is the layer where you can place your objects e.g. Text, panels etc.
    Container con;
    JPanel titleNamePanel;

    public static void main(String[] args) {

        new Main();

    }
    public Main(){

        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();
        // Displays title Name
        titleNamePanel = new JPanel();
        /* Draws a rectangle at positions x, y, with a with of 600 and a height of 150 */
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(blue);
        con.add(titleNamePanel);
    }


}