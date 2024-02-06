package org.example;

public class Car extends Vehicle {

    public String name;
    public int age;

    public String Make;

    Car(String name, int age, String Make){

        this.name = name;
        this.age = age;
        this.Make = Make;
    }

    @Override
    void go() {
        System.out.println("Going on four wheels");
    }

    void printAttributes() {
        System.out.println("This car is: " + age + " years old, is of make: " + Make + " and is called: " + name);
        go();
    }

}
