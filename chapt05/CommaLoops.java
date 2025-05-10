package chapt05;

public class CommaLoops {
    /*using commas in both the initialization phase and iteration parts of code */
    public static void main(String[] args) {
        int a, b;

        for (a = 1, b = 4; a < b; a++, b--){
            System.out.println("a is " + a);
            System.out.println("b is b " + b);

        /* there are variants of the for loop that you may not
         * use the initialization variable or the iteration
         * for (int i = 4; !done; i ++)
         * if (interrupted()) done = true
         * or omit using those variables at all
         * if (; !done ;) would still work fine
         */
        }
    }
}
