package chapt15;

/*Method References 
 * method references relates a way to call methods without executing it
 * it relates to lambda expressions because it too require target types
 * it has two types methods reference static methods
 * 
 * 
 * General syntax for  static method reference
 * ClassName::methodName, :: a separator
 * this also needs a functional interface
 */


 interface StringFunc{
    String func(String n);
 }

//this class defines a static method
public class MethodRefReadme {
    static String strReverse(String str) {

        String reverse = "";
        int i;
        for (i = str.length()-1; i >=0; i--)
            reverse += str.charAt(i);
        return reverse;
    }
}

class DemoMethodRef {
    /*
     * this method has a functional interface as its first parameter
     * hence it can take instance of a functional interface including 
     * a method reference
     */
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

}
