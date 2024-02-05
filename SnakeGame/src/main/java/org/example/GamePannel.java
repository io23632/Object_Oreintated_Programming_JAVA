package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.random.RandomGenerator;

public class GamePannel extends JPanel {

    // screen width
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    //size of objects in game
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    // delay for game. The higher the delay the slower hte game is:
    static final int DELAY = 75;

    // ARRAYS that hold the body parts for the snake

    final int x[] = new int[GAME_UNITS]; // x co-ordinate to hold the Size of snake, it won't ever be bigger than the size of the game
    // i.e. game units
    final int y[] = new int[GAME_UNITS]; // y co-ordinate ot hold the size of the snake


    // Initial body parts of the snake, these will increase as the snake consumes apples:
    int BodyParts = 6;
    int applesEaten = 0;

    /*
    *  Location of the apple: using x y co-oridantes. Because we want to apples to appear
    * at random we imported the random number genarator
    */
    int appleX;
    int appleY;
    // Direction of the Snake:
    char direction = 'R';
    /* The direction of the snake will be R for right
    * L for left
    * U for Up
    * and D for Down */


boolean running = false;
Timer timer;
Random random;


    GamePannel(){
        // Create a instance of the random class
        random = new Random();
        // Set the preffered size of the game pannel:
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        // Set the background colour:
        this.setBackground(Color.LIGHT_GRAY);
        // set the focasability:
        this.setFocusable(true);

    }

    public void startGame() {

    }

    public void paintComponent(Graphics g){

    }

    public void draw(Graphics g) {

    }

    public void move() {

    }
    public void checkApple() {

    }

    public void checkCollisions(){

    }

    public void gameOver(Graphics g){

    }
    public void actionPerformed(ActionEvent e){

    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent key) {

        }
    }
}
