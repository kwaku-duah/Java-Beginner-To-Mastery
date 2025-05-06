package chapt03;

public class FloatDoubleTypes {
    /* Usage of float could be mostly for currency, temperature, low precision
     * whereas double data type could be for high precision, scientific, 
     * calculations
     * Demonstrating calculation for area of a circle
    */
   public static void main(String[] args) {
    double pi, r, a;

    r = 10.8;

    pi = 3.1416; 

    a = pi * r * r;

    System.out.println("The area for the circle to a high precision is " + a);
   }


}
