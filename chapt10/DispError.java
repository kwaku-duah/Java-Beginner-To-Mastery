package chapt10;

import java.util.Random;

public class DispError {
    /*actually throwing the error after catching it
     * throwable class overrides the toString() method in objects
     */
    public static void main(String[] args) {
        int a, b , c = 0;
        Random r = new Random();
       
        for (int i = 0; i < 100; i++){
             try {
             b = r.nextInt();
             c = r.nextInt();

             a = 100 / (b/c);
        } catch (ArithmeticException e) {
            System.out.println("Printing out to see it " + e);
            a = 0;
        }
        System.out.println("After catch");
        }

    }
}
