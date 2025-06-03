package chapt12;



public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOB, iOB2;
        int i;

        iOB = 100;
        System.out.println( "Original value of iOB" + iOB); //boxes

        /*following code snippet unboxes, does increment operation
         * then boxes
         */
        ++iOB;
        System.out.println("After iOB " + iOB);

        /*
         * unboxed and expression is evaluated, results is reboxed
         * 
         */
        iOB = iOB + (iOB/3);
        System.out.println("IOB after expression " + iOB);

        /*evaluation of result, but it is not reboxed */
        i = iOB + (iOB/3);
        System.out.println("I AFTER EXPRESSION " + i);
    }
}
