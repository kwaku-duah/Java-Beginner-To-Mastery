package chapt12;

public class Annotations {
    /*annotations are supplemental information embedded in source files
     * does not change funtionality or semantics, just necessary information 
     * necessary for deployment and deployment
     * 
     * all annotation types start with @, and they contain solely method 
     * declarations without bodies, Java implements it
     * 
     * annotation types cannot use the extends keyword, they all are subclasses 
     * of Annotation class which has methods etc
     */
    @interface MyAnno {
        String str();
        int val();
    }

    /*annotations precede all declarations */
    @MyAnno (str = "Annotation Example", val = 100)
    public static void myMeth() {
        //this annotation is linked with method myMeth
    }
}
