package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Car car = new Car("Porceh", "911", 2019);

        /* accessing private variables in the Car class  */
        //      System.out.println(car.getYear());

        car.setYear(2009);
        System.out.println(car.getYear());

    }
}