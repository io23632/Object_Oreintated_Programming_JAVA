package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       // Sets can be used as an ArrayList, but are subtly different

        // Set is an interface, that is implemented by HashSet. HashSet is a class
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Walter");
        // Print out the names:
             //names.forEach(System.out::println);
            // Output : Walter, John

        /*  Difference 1 between List and Set:
        * A list maintains the order that the items were places in
        * A Set will put the put in the elements in random order */

        /*  Difference 2: HashSet will contain only unique items, you cannot
        * have two things of the same object in the Set
        * This means that if you have a list that contains duplicates, rather
        * than writing complex code to remove duplicates you can just convert the ArrayList to a HashSet
        * and this will automatically remove duplicates for you */

        // Converting List to HashSet

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        numbers.add(4);
        numbers.add(3);

        // Convert the ArrayList of numbers to HashSet
        Set<Integer> newNumbers = new HashSet<>(numbers);

        /* Difference 3: You cannot remove things by index in a HashSet */

        // Other useful methods in Set:
        /*
        * .size(); Will tell you the size of the set
        * .contains(); Will return a boolean if your set contains an elements
        * .isEmtpy(); will tell you if your set is empty
        * .clear(); Will clear the Set of all elements
        * */

        ////////// Iterating over our Set to Print them or do other things ///

        // Method 1 : Enhanced For Loop:

//        for (String name : names) {
//            System.out.println(name);
//        }

        // Method 2 : forEach (lamdas)

//        names.forEach(System.out::println);

        // Method 3: Create an iterate object

//        Iterator<String> namesIterator = names.iterator();
//        while(namesIterator.hasNext()) {
//            System.out.println(namesIterator.next());
//        }

    }
}