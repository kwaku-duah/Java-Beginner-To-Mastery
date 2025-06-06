package chapt10;

public class MultipleCatches {
    /*if multiple exceptions may occur
     * then multiple catch statements maybe used
     */

     public static void main(String[] args) {

        try {
            int a = args.length;
            System.out.println("a " + a);

            int b = 42 / a;

            int[] c = { 1 };

            c[0] = 99;
        } catch(ArithmeticException e){
            System.out.println("Holding math error " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Attempting to touch where " + e);
        }
        System.out.println("after catch statement");

     }
}
