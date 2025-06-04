package chapt12;
//show all annotations for a class and method

import java.lang.annotation.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnota {
    String str();

    int val();
}

/*to fetch an annotation for a single object, you use getAnnotation()
 * if fetching all existing annotations in a class or method is getAnnotations() with a letter s
 */

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

//annotate a class
@What(description = "Testing Annotation For A Class")
@MyAnnota(str = "Annotation Class Example", val = 99)
class ShowAll {

    //annotate a method
    @What(description = "Testing Annotation For A Method")
    @MyAnnota(str = "Test Method", val = 90)
    public static void myMethane(){
        ShowAll ob = new ShowAll();

        //trying to get all annotations for all methods and classes
        try {
            Annotation[] annt = ob.getClass().getAnnotations();

            for (Annotation a: annt) 
            System.out.println("All available annotation in the class: " + a);

            //Display all annotation on methods
            Method m = ob.getClass().getMethod("myMethane");
            
            annt = m.getAnnotations();
            System.out.println("Show all annotations ");

            for (Annotation a: annt) 
            System.out.println("Methods annotation " + a);

          
            

        } catch (NoSuchMethodException e) {
            System.out.println("No such method ");
        }
    }

    public static void main(String[] args) {
        myMethane();
    }

}