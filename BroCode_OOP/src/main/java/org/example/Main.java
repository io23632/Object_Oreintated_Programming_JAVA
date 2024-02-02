package org.example;
import java.util.Arrays;
// Garage: Passing objects Car and Bike
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car("BMW", 2017);
        Car car2 = new Car("Merc", 2018);
        Bike bike1 = new Bike("Yamaha", 2016);

        garage.park(car1);
        garage.remove(car2);
        garage.park(bike1);

    }

}
