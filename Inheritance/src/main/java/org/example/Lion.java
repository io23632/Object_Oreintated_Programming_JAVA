package org.example;

public class Lion extends Mammal {

    Lion(int LifeSpan, double weight) {
        this.LifeSpan = LifeSpan;
        this.weight = weight;
    }
    public void Sound(){
        System.out.println("Grrrr");
    }
}