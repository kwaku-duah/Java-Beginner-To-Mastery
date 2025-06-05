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

    //annotate field
    @EmptyOK String test;

    //use type annotation to annotate THIS
    public int f(@TypeAnno DemonstrateTypeAnnotations<T> this, int x) {
        return 10;
    }

    //Annotate a return type
    public @TypeAnno Integer f2(int i, int j){
        return i + j;
    }

    //annotate method declaration
    public @Recommended Integer f3(String str){
        return str.length() / 2;
    }

    //use a type annotation with a throws clause
    public void f4() throws @TypeAnno NullPointerException {
        //
    }

    //annotate array levels 2D arrays, String[][]
    String @MaxLex(10) [] @NotZeroLen [] w;

    //annotate array element
    @TypeAnno Integer[] vec;


    public static void myMethol(int i) {
        //use type annotation on a type argument
        DemonstrateTypeAnnotations<@TypeAnno Integer> ob = new DemonstrateTypeAnnotations<@TypeAnno Integer>();

     //use typ annotation with new
    @unique DemonstrateTypeAnnotations<Integer> ob2 = new @unique DemonstrateTypeAnnotations<Integer>();

    Object x = Integer.valueOf(19);
    Integer y;

      //using type annotations on cast
    y =  (@TypeAnno Integer) x;
    }

    public static void main(String[] args) {
        myMethol(19);
    }

  //use type annotation with inheritance clause
class SomeClass extends @ TypeAnno DemonstrateTypeAnnotations<Boolean> { }

}
