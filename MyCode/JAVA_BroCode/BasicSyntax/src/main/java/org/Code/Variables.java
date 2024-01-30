package MyCode.JAVA_BroCode.BasicSyntax.src.main.java.org.Code;

public class Variables {
    public static void main(String[] args) {
        String goal = "How To Swap Two Variables";
        System.out.println("What we are doing in this: " + goal);
        // variables:
        String x = "Water";
        String y = "Coke";
        String temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x used to contain Water, now x is: " + x);
        System.out.println("y used to contain Coke, now y is: " + y);
    }
}
