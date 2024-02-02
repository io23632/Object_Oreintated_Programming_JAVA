package org.example;
// Array of Objects
public class Garage {

    void park(Car car) {
        System.out.println("The car " + car.name + " is parked in the garage ");
        System.out.println("The age of this parked car is: " + car.age);
    }

    void remove(Car car) {
        System.out.println("The car: " + car.name + " is removed from the garage");
    }

    void park(Bike bike) {
        System.out.println("Added bike with name: " + bike.name + " and age: " + bike.age + " to the garage");
    }

}
