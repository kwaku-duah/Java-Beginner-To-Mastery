package chapt03;

public class DynamicInitializer {
    /* Computing the hypotenuse of a right angle triangle
     * follows sqrt(H) = square of length + square of length
     */
    public static void main(String[] args) {
        //initialized to constants
        double a = 3.0, b = 4.0;

        //c is dynamically initialized
        double c = Math.sqrt(a * a + b * b);

        System.out.println("The hypotenuse of the triangle is " + c);
    }
}
