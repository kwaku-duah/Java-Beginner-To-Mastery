package chapt13;

/*taking advantage of the static keyword */
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class AdvantageStatic {
    /*taking advantage of static imports */
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;

        //streamlined code with minimal input
        hypot = sqrt(pow(side1, 1) + pow(side2, 2));
        System.out.println("Given lengths " + side1 + " " + side2 + " hypotenuse is " + hypot);
    }


}
