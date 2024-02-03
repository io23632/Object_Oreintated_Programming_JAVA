package org.example;

public class Main {
    public static void main(String[] args) {
        // inheritance is the process where one class acquired the
        // attributes and methods of another
        Mammal[] mammal = new Mammal[2];
        mammal[0] = new Lion(12, 200);
        mammal[1] = new Tiger(13, 300);

       for (Mammal mCurr : mammal) {
           mCurr.StateAttributes();
           mCurr.Sound();
       }



        }
    }
