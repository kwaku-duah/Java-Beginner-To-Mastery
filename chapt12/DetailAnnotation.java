package chapt12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME) /*if retention type is not runtime, and it has no values,
it will return null */

//Annotation type declaration
@interface MyAnnotate { 
    String str();

    int val();
}

class Meta {
    //annotate a  method
    @MyAnnotate(str = "Annotation Example", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        //obtain annotation for this method and find the values for the annotation

        try {
            //get a class object representing the class in question
            Class <?> c = ob.getClass();

            //get a  method object that represents this object
            Method m = c.getMethod("myMeth");

            //get annotation for this class
            MyAnnotate ann = m.getAnnotation(MyAnnotate.class);

            //finally display the values
            System.out.println(ann.str() + " "  + ann.val());


        } catch (NoSuchMethodException e) {
            System.out.println("There is no such method!");
        }
    }

    public static void main(String[] args) {
        //calling the method
        /* this program uses reflection to get information about a class during
         * runtime 
         */
        myMeth();
    }
}