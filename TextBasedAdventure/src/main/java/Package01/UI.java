package Package01;

import javax.print.DocFlavor;
import javax.swing.*;

import java.awt.*;

import static java.awt.Color.*;

public class UI {

    JFrame window;
    JPanel titleNamePanel, startButtonPanel, playerPanel, mainTextPanel, choiceButtonPanel, playerNamePanel;
    JLabel titleNameLabel, hpLabel, hpNumberLabel, weaponLabel, weaponTypeLabel, playerNameLabel, playerName;
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    JTextField playerNamePrompt;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 24);

    public void createUI(Game.ChoiceHandler cHandler){
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

        //Player Name Prompt:
        playerNamePanel = new JPanel();
        playerNamePanel.setBounds(50, 50, 300, 100);
        playerNamePanel.setBackground(black);
        playerNamePrompt = new JTextField("Enter your name here: ");
        playerNamePrompt.setBounds(50, 50, 300, 100);
        playerNamePrompt.setBackground(black);
        playerNamePrompt.setForeground(white);
        playerNamePrompt.setFont(normalFont);
        playerNamePrompt.setEditable(false);
        playerNamePanel.add(playerNamePrompt);

        // Start Button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(black);
        startButton = new JButton("START");
        startButton.setBackground(black);
        startButton.setForeground(magenta);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("start");
        startButtonPanel.add(startButton);


        window.add(titleNamePanel);
        window.add(startButtonPanel);
        //window.add(playerNamePanel);

        // Game Window
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(black);
        window.add(mainTextPanel);
        mainTextArea = new JTextArea("This is the main text area");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(black);
        mainTextArea.setForeground(white);
        mainTextArea.setFont(normalFont);
        /*This method belongs to the JTextArea object class, it wraps text so that if the text is outside the bounds of the
        * JTextArea bounds the text will continue to a new line rather than continuing horizontally */
        mainTextArea.setLineWrap(true);
        /*This causes the lines to be wrapped at word boundaries like spaces, to give a more visually appealing layout to the text */
        mainTextArea.setWrapStyleWord(true);
        /*This prevents the text from being editable from the user*/
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150 );
        choiceButtonPanel.setBackground(black);
        // create the panels for the 4 buttons:
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        window.add(choiceButtonPanel);

        // create the four buttons:
        choice1 = new JButton("choice 1");
        choice1.setBackground(black);
        choice1.setForeground(magenta);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);
        choice2 = new JButton("choice 2");
        choice2.setBackground(black);
        choice2.setForeground(magenta);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);
        choice3 = new JButton("choice 3");
        choice3.setBackground(black);
        choice3.setForeground(magenta);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);
        choice4 = new JButton("choice 4");
        choice4.setBackground(black);
        choice4.setForeground(magenta);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(cHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(black);
        playerPanel.setLayout(new GridLayout(1, 6));
        window.add(playerPanel);

        hpLabel = new JLabel("HP: ");
        hpLabel.setForeground(white);
        hpLabel.setFont(normalFont);
        playerPanel.add(hpLabel);
        hpNumberLabel = new JLabel();
        hpNumberLabel.setForeground(white);
        hpNumberLabel.setFont(normalFont);
        playerPanel.add(hpNumberLabel);
        weaponLabel = new JLabel("Weapon: ");
        weaponLabel.setForeground(white);
        weaponLabel.setFont(normalFont);
        playerPanel.add(weaponLabel);
        weaponTypeLabel = new JLabel();
        weaponTypeLabel.setForeground(white);
        weaponTypeLabel.setFont(normalFont);
        playerPanel.add(weaponTypeLabel);
        playerNameLabel = new JLabel("Player: ");
        playerNameLabel.setForeground(white);
        playerNameLabel.setFont(normalFont);
        playerPanel.add(playerNameLabel);
        playerName = new JLabel();
        playerName.setForeground(white);
        playerName.setFont(normalFont);
        playerPanel.add(playerName);

        window.setVisible(true);
    }
}
