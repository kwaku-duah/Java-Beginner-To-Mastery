package chapt10;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int  a = 0; 
        int b = 0;
        int c = 0;
        Random r = new Random();

        for ( int i  = 0; i < 10; i++){
            try {
                b = r.nextInt();
                c = r.nextInt();

                a = 4200 / (b/c);
                System.out.println(a);
            } catch(ArithmeticException e) {
                System.out.println("Division by zero");
                a = 0;
            }
            System.out.println("After try catch block");
        }
    }
}
