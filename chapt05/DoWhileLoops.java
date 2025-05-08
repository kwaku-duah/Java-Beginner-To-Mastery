package chapt05;

public class DoWhileLoops {
    /* do while loops
     * executes the body of the loop before checking for the while condition
     * executes so far as the condition is true
     */

     public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("ticks is " + n);
         } while ( --n > 0);
     }
}
