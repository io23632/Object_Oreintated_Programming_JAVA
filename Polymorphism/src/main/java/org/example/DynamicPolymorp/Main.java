package org.example.DynamicPolymorp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal do you want? ");
        System.out.println("1: Dog, 2: Cat, 3: Bird");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Dog dog = new Dog(200);
            dog.price();
        } else if (choice == 2) {
            Cat cat = new Cat(100);
            cat.price();
        } else if (choice == 3) {
            Bird bird = new Bird(100);
            bird.price();
        }
        else {
            System.out.println("Please make a selection between 1, 2 or 3");
        }
    }
}
