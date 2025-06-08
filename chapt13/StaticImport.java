package chapt13;

public class StaticImport {
    /*keyword static can be added after import keyword to 
     * import static members of a class or interface directly
     */
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;

        //notice how pow() and sqrt must be qualified by their class  names
        hypot = Math.sqrt(Math.pow(side1, 1) + 
                        Math.pow(side2, 2)) ; 
        System.out.println("Given sides of length " + side1 + " " + side2 + " the hypotenuse is " + hypot);
    }
}
