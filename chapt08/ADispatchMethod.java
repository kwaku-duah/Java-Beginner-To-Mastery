package chapt08;

public class ADispatchMethod {
    /*method overriding is an intriguing concept in java
     * it comes about dynamic method dispatch which enforces 
     * the theory that a superclass reference can be used for an 
     * object in order for runtime polymorphism to work
     * with this, method overriding is resolved during runtime
     */
    
     void callme() {
        System.out.println("Callme method inside A");
     }

}

class BDispatchMethod extends ADispatchMethod{

    void callme(){
        System.out.println("Callme method inside B");
    }
}

class CDsispatchMethod extends BDispatchMethod{
    void callme(){
        System.out.println("Callme method inside C");
    }
}

/* Method overriding demonstration
 * all methods have the same name, same type signature
 */

 class GetWorking{
    public static void main(String[] args) {
        //making type of objects for all the classes above
        ADispatchMethod a = new ADispatchMethod();

        BDispatchMethod b = new BDispatchMethod();

        CDsispatchMethod c = new CDsispatchMethod();

        /* all these are objects [ a, b , c] 
         * demonstration for how dynamic method dispatch is achieved with
         * organized code
        */

        //making a variable to reference the superclass
        ADispatchMethod ref;

        //all methods are overriden, so an organized way to call it
        ref = a; //this ref at runtime sees the object to be of type B
        ref.callme();

        ref = b; //of type b

        ref.callme();
        ref = c; //of type c

        //demonstration
        /* all we care about is calling ref and the overriden method
         * the compiler at  runtime would resolve which particular one 
         */

         ref.callme();

    }
 }
