package chapt03;

public class ConversionAutomatic {
    /* type promotion in java, small datatypes are
     * promoted to large datatypes if there is an
     * operation
     */

    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f; //float variables
        double d = .1234;
   
        // operands that are smaller are casted to large
        double result = (f * b) + ( i /c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("The result is " + result);
    }
}
