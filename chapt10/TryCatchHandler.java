package chapt10;

public class TryCatchHandler {
    //usage of try catch in java
   public static void main(String[] args) {
     int a, d;

    try {
        d = 0;
        a = 42 / d;
        System.out.println("This will not be printed");
    } catch(ArithmeticException e) {
        System.out.println("this error will be handled");
    }
    System.out.println("After catch statement");
   }
}
