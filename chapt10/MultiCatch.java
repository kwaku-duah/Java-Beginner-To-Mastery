package chapt10;

public class MultiCatch {
    /*use a single caatch statement
     * to avoid code duplication
     */

    public static void main(String[] args) {
         int a=10,b =40;

     int[] vals = {1, 2, 3, 4};
     try {
        int result = a/b; // division by zero error

        vals[10] = 29; //indexoutof bounds
     } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
     }
    }

}
