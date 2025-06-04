package chapt12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@interface SingleMemberAnnot {
    int value(); //method name should be value to be able to enjoy the shorthand form
}
/*works like a normal annotation except it takes a single member
     * the annotation can be called without name of the member but just value
     * however to benefit from this shorthand, your member variable name should be value
     * 
     */
public class SingleMemberAnno {

    @SingleMemberAnnot(999)
    public static void meMyth() {
        SingleMemberAnno ob = new SingleMemberAnno();

        try {
            Method m = ob.getClass().getMethod("meMyth");

            SingleMemberAnnot q = m.getAnnotation(SingleMemberAnnot.class);
            System.out.println(q.value());
        } catch (NoSuchMethodException e) {
            System.out.println("No method found");
        }
    }

    public static void main(String[] args) {
        meMyth();
    }
}
