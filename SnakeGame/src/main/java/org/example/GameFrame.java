package org.example;

import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame()
    {
        GamePannel pannel = new GamePannel();
        this.add(pannel);;
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        // makes the frame visible
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
