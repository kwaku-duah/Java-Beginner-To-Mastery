package chapt07;

public class ModernVar {
    /* defining variable args for a method
     * methods with variable length of arguments is called
     * variable arity methods
     * 
     */

     static void vaTest(int ... v) {
        for (int x: v){
            System.out.print("values for x " + x);
            System.out.println( );
        }
     }

     public static void main(String[] args) {
        vaTest(10);
        vaTest(20,30,59);
     }
}
