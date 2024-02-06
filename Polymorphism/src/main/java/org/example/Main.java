package org.example;

class Main {
     public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();
        Vehicle[] vehicles = {car, bike, boat};

        // Using a standard style for loop
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].go();

        }

        // Using enhanced for loop that will itterate over the array once:
        for(Vehicle i : vehicles) {
            i.go();
        }
        // Here Vehicle is the name of the data type
        // i is the counter
        // : vehicles which is the name of the array storing all the Vehicle Types
        // you don't need a stop condition because the loop will iterate over once in the array


    }
}