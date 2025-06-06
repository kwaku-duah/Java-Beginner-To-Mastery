package chapt07;

public class VariableArity {
    /*a method that takes normal parameters
     * 
     * and a varargs
     * rules are:
     * there can only one varargs in a method declaration
     * it must be the  last parameter
     */

    static void vaTest(String message,int ... vals){

        for (int x: vals) {
            System.out.print(x + " ");
        System.out.println(message + vals.length);
    }
     }

     public static void main(String[] args) {
        vaTest("Message", 1,2, 3);
     }
}
