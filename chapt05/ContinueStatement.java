package chapt05;

public class ContinueStatement {
    /* continue statement is used to skip a certain part of the body
     * of code and focus on the iteration
     */
   public static void main(String[] args) {
     for (int i = 0; i < 10; i++){
        System.out.println("values for i " + i);

        if (i%2 == 0) continue; //if i/2 gives a remainder of zero, program does not move to the print, it goes up to iterate again
        System.out.println(i);
    }
   }
}
