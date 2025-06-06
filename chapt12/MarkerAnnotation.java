package chapt12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/*special forms of annotations that have no members
 * it is used to mark an item
 * there is a method under annotatedElement, isAnnotationPresent() that is 
 * used to check whether a marker annotation is present or not
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MarkerAnno { }

public class MarkerAnnotation {

    //marker annotation linked to this method, without opening and closing parenthesis
    @MarkerAnno
    public static void myMethan() {
        try {
            MarkerAnnotation ob = new MarkerAnnotation();

            Method m = ob.getClass().getMethod("myMethan");

            if (m.isAnnotationPresent(MarkerAnno.class)) System.out.println("My marker is present");
        } catch(NoSuchMethodException e) {
            System.out.println("No such method");
        }
    }
    public static void main(String[] args) {
        myMethan();
    }
}
