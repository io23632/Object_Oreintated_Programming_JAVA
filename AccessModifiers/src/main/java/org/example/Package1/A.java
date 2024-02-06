
package org.example.Package1;
import org.example.Package2.*;
public class A {

    public static void main(String[] args) {

        C c = new C();
        System.out.println(c.pubMessage);
    }
    protected String protectedMessage = "This is using the protected access modofier";
}
