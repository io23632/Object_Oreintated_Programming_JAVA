package org.example;

public class Human {

    String name;
    int age;
    double weight;

    //Constructor for Human
    Human(String name, int age, double weight) { // The attributes for the Human Constructor type is defined in the bracakets

        this.age = age;
        this.name = name;
        this.weight = weight;
    }
    void food(){
        System.out.println(this.name + " is eating");;
    }
    void drink(){
        System.out.println(this.name + " is drinking");
    }
}
