package chapt12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface DefInterface {
    String str() default "Testing";

    int val() default 9000;
}

public class DefaultValueAnnotation {
    /*
     * default value can be set for an annotation
     * so incase nothing is specified it defaults to that
     * it is of the form
     * type member() default value;
     * value should be of the same type as value
     * 
     */
    @DefInterface() //defaults to the defaults given values
    public static void myMetha(){
        DefaultValueAnnotation ob = new DefaultValueAnnotation();

       try {
         //obtain an object of type class
        Class<?> c = ob.getClass();

        //now obtain a method to get the annotation
        Method m = c.getMethod("myMetha");

        //get the annotation
        DefInterface annota = m.getAnnotation(DefInterface.class);
        System.out.println(annota.str() + " " + annota.val());
       } catch (NoSuchMethodException e) {
        System.out.println("No method like this is found");
       }
    }

    public static void main(String[] args) {
        myMetha();
    }

}
