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
}
