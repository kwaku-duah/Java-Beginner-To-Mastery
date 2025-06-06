package chapt05;

public class JumpStatements {
    /*there are three jump statements in loops
     * continue
     * break
     * return
     * these statements transfer control to another part of your program
     * you can also change your programs flow of execution through 
     * exception handling, using, (try, catch, throw, throws, final)
     */

     public static void main(String[] args) {
        /*using the break statement
         * to terminate a statement, 
         * exit a statement and 
         * civiled form of the GOTO statement
         */

         for(int i = 0; i < 10; i++){
            if ( i == 5) break; //break statement terminates the program once i == 5
            System.out.println("these values run " + i);
         }
         System.out.println("Loop condition has been has been met");
     }

}
