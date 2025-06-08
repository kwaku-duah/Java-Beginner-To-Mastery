package chapt13;

public class ConstructorInvoking {
    /*in constructor overloading
     * a constructor may be invoked within another constructor
     * it is accomplished by using another form of the THIS Keyword
     * takes the form this(arg-list)
     * the call to THIS must be the first statement within the constructor
     */

     int a, b;

     //initialize A and B individually
     ConstructorInvoking(int i, int j) {
        a = i;
        b = j;
     }

     //initialize A and B to the same value
     ConstructorInvoking(int i){
        a = i;
        b = i;
     }

     //give a and b default values of zero
     ConstructorInvoking() {
        a = 0;
        b = 0;
     }
}
