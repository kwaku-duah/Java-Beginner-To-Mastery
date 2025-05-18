package chapt07;

public class TestPrimitive {
    /*arguments passing are of two types
     * call-by-value and call-by-reference
     */

     void meth(int i, int j) {
        i *= 2;
        j /= 2;
     }
}

class Exercise {
    public static void main(String[] args) {
        TestPrimitive obj = new TestPrimitive();

        int a = 15;
        int b = 18;

        System.out.println("these are the values for a and b,before call " + a + " " + b);

        obj.meth(a, b);

        System.out.println("values of a and b after call: " +a + " " + b );
/*operations that occure inside meth has no effect on the values of a and b */


    }
}
