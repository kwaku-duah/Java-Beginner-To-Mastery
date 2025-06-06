package chapt10;

public class OrderExceptionsCatch {
    /*in ordering catch statements
     * if a series of catch statements have a superclass exception precede
     * its subclass, the subclass exception would never be reached -
     * unreachable code in java gives a compile time error
     * 
     * this is because a superclass handles errors for all of its subclasses
     */
    public static void main(String[] args) {
        int a, b, c;
        try {
            b = 10;
            c = 0;
            a = b / c;
            System.out.println("Would never print");
        } catch (Exception e) {
            /* this is superclass in exception, wont go any further below these */
            System.out.println("This will always trigger");

         } 
        // catch (ArithmeticException e) {
        //     System.out.println("Won't be reached"); //unreachable code
        // }
    }
}
