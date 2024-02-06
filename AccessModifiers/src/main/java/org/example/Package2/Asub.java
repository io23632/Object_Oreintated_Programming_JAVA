package org.example.Package2;
import org.example.Package1.*;

public class Asub extends A {
    public static void main(String[] args) {

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);

    }

}
