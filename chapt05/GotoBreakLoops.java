package chapt05;

public class GotoBreakLoops {
    /*civilized form of the goto statement
     * provides to jump to any part of your code
     * a defined block or blocks with names
     * starts with an identifier followed by a colon
     */

    public static void main(String[] args) {
        boolean t = true;

         first: {
        second: {
            third: {
                System.out.println("before the break");
                if (t) break second;
                System.out.println("this will not execute");
            }
            System.out.println("this will not execute");
        }
        System.out.println("this will execute");
     }
    }
}
