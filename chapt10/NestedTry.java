package chapt10;

public class NestedTry {
    /*nested try statements attempts to 
     * use any catch block available to it to resolve exceptions
     */
   public static void main(String[] args) {

    try{
        int a = args.length;
        
        int b = 42/ a; //this will generate Arithmetic exception if no arguments is given when called

        System.out.println("a " + a);
        try {

            //creating a division by zero error
            if (a == 1) a = a / (a-a); //this should at least be reached

            if (a == 2) {
                int[] c = { 1 };
                c[42] = 100;
            } 
        } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("indexoutofbounds " + e);
            }

    } catch(ArithmeticException e) {
        System.out.println("arithemicexceptions " + e);
    }
   }
}
