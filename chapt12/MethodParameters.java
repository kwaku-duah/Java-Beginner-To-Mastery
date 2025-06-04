package chapt12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@interface DemoInterface {
    String str();

    int val();
}

public class MethodParameters {

    //linking myMet method with an annotation(DemoInterface)
    @DemoInterface(str = "Demo Interface", val = 100)
    public static void myMet(String str, int val){

        MethodParameters ob = new MethodParameters();
        /*this time around we are going to test myMet method
         * that takes parameters...so we are bound to overextend
         * ob is an object of type class
         */

       try {
         //get a reference to the said class in question
        Class<?> c = ob.getClass();

        //get a method of the class in question( method has parameters)
        Method m = c.getMethod("myMet",String.class, int.class);

        //get the annotation
        DemoInterface annot = m.getAnnotation(DemoInterface.class);

        System.out.println(annot.str() + " " + annot.val());
       } catch (NoSuchMethodException e) {
        System.out.println("No method found ");
       }
    }

    public static void main(String[] args) {
        myMet("Two Parameters", 12_344);
    }
}
