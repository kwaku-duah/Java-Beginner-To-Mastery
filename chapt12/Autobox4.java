package chapt12;

public class Autobox4 {
    public static void main(String[] args) {
        /*boxing and autoboxing occurs then if necessary
         * for promotions and conversions
         */
        Integer iOB = 100;
        Double dOB = 98.6;

        dOB = dOB + iOB; //ALL THE TERMS HERE WILL BE UNBOXED, ADN IOB WILL BE PROMOTED TO DOUBLE
        System.out.println("value is " + dOB);
    }
}
