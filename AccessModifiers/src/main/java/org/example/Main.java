package org.example;

import org.example.Package2.C;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    /*      PUBLIC:
    *   public access modifiers make classes, methods, refereance and primative data types visible to all folders in the same project directory, hence why I can
    * access the pubMessage (from class C) in Class A even though it is in a different package folder but cannot access defaultMessage which does not have the public
    * message modifier
    * This goes for classes too, I can access Class C in Class A in the first place because I made class C public, if I remove the public prefix from Class C, I can't access
    * the Class C in A but can access in Asub which is in the same package folder as C
    * */

        /* PROTECTED:
        * A protected modifier allows access to that class, method, referecne or primative data type as long as that class is an extention of the class that contains
        * the protected message
        * e.g. In class A we have declared the protected String protectedMessage, we can access this is Asub, but not in C or B (which is in the same
        * pacakage as class A, becauase only Asub extends Class A
        * */

        /* PRIVATE
        *  A private data type can only be accessed in the same class
        *
        * */
    }



}