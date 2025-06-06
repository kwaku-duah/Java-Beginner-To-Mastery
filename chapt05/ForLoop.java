package chapt05;

public class ForLoop {
    /* demonstration of the for loop
     * assumes the form for (initialization; condition; iteration) body or {body}
     */
    public static void main(String[] args) {
        int n;

        // it is desirable to define the initialiser with type in the loop, if it wont be used elsewhere again
        // would be for (int n = 10; n > 0; n--)
        for (n = 10; n > 0; n--)
            System.out.println("tick " + n);
    }
}
