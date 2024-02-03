package org.example;

public class Mammal {
    public int LifeSpan;
    public double weight;

    public void StateAttributes() {
        System.out.println("I am a mammal I live for: " + LifeSpan + " years" + " And I weight: " + weight + " kg");
    }

    public void Sound() {
        System.out.println("I make the sound: ");
    }
}
