package chapt12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)  //for type use to work, you must explicity add TargetAnnotation of type TYPE_USE
@Retention(RetentionPolicy.RUNTIME)
@interface TypeAnnot {

}
public class TypeAnno {
    /*
     * type annotations is a latest addition to java and it is used for types in java
     * it is used by tools to help prevent errors, it applies to types that the annotation precedes
     * 
     */
    void meMyth() throws @TypeAnnot NullPointerException {

        /*
         * so here: the annotation applies to NullPointerException
         */
    }

    /*annotation for this is allowed in java in modern editions, (this) is an argument which is implicit
    for all instances,it can be declared as first argument, in the declaration, the type of (THIS) should be its class
     */
    
    void myMethanol(TypeAnno this, int i){
        //here this is of type TypeAnno CLASS
    }

}
