package org.example;
import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {

        String goal = "Create a Simple Graphical User Interface";
        System.out.println("What we are doing in this: " + goal);

        // This requires importing Java.swing.JOptionPane;

        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your age is:  " + age);




    }
}
