package chapt12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/*repeated annotations - an annotation can be repeated on the same element
 * it uses the @Repeated annotation that takes an argument
 * for this to work, a container annotation type is created and it is assigned
 * as an argument to the Repeated annotation
 * to get the annotation, you use the container type annotation not the repeated annotation 
 * with getAnnotation()
 */

// Make my anno repeatable
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepeatedAnno.class)
@interface MyAnnotar {
    String str() default "Testing";

    int val() default 9000;
}

// container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface RepeatedAnno {
    MyAnnotar[] value(); // value field is an array of repeatable annotation type
}

public class RepeatedAnnotation {
    // use the repeatable on a class
    @MyAnnotar(str = "Repeated 1st", val = 20_000)
    @MyAnnotar(str = "Repeated 2nd", val = 30_000)
    public static void meMethanol(String str, int i) {

        RepeatedAnnotation ob = new RepeatedAnnotation();

        try {
            // reference object for the class
            Class<?> c = ob.getClass();

            // get the method and its annotations, method object
            Method m = c.getMethod("meMethanol", String.class, int.class);

            // display the repeated RepeatedAnno
            Annotation od = m.getAnnotation(RepeatedAnno.class);
            System.out.println(od);

            //another way to get annotations..
            Annotation[] annul = m.getAnnotationsByType(RepeatedAnno.class);

            for (Annotation a: annul) System.out.println(a + "alternative form of getting annotations");

        } catch (NoSuchMethodException e) {
            System.out.println("No such method handled");
        }
    }

    public static void main(String[] args) {
        meMethanol("completed", 23_88);
    }
}
