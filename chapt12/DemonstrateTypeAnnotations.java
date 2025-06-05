package chapt12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*marker annotations that can be applied to a type
 * 
 */

//a marker annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
@interface TypeAnno {
}

// annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {
}

// still annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
@interface unique {
}

// parameterized annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
@interface MaxLex {
    int value();
}

// annotation that can be applied to a type parameter
@Target(ElementType.TYPE_PARAMETER)
@interface What {
    String description();
}

// annotation that can be applied to a field declaration
@Target(ElementType.FIELD)
@interface EmptyOK {
}

// annotation that can be applied to a method declaration
@Target(ElementType.METHOD)
@interface Recommended {
}

// using annotation on a type parameter (we defined a parameterized annotation
// called WHAT)
public class DemonstrateTypeAnnotations<@What(description = "Generic type description") T> {

    //use type annotation on a constructor (used unique annotation)
    public @unique DemonstrateTypeAnnotations(){}

    //annotate type, {not field}
    @TypeAnno String str;
    /* 
     * the type String is annotated not the field str;
     */

}
