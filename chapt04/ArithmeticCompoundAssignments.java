package chapt04;

public class ArithmeticCompoundAssignments {
    /* this is a special way to write arithmetic operations
     * var = var operation expression can be written as 
     * var operation = expression
     * benefits are less typing and efficiency in some cases
     */
    
     public static void main(String[] args) {
        //assignment compound operators
        int a = 1;
        int b = 2;
        int c = 3;

        //arithmetic compound assignments

        a += 4;
        b *= 5;
        c += a * b;
        c %=6;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(c);
     }
}
