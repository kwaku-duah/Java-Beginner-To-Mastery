package chapt08;

abstract public class AbClass {
    /*abstract keyword
     * superclasses can define structure of generalized classes without full implementation
     * in that vein, abstract keyword is used to require that subclasses fully implement these methods
     * it is of the form (abstract type name/identifier(param-list);)
     * it has no body, so the subclass must implement it
     * a class with one or more abstract classes must be prefixed with abstract
     * there can be no object created from an abstract class and also there 
     * cannot be an abstract constructor or abstric static methods
     * a subclass created from a superclass must implement fully all abstract methods or be
     * declared an abstract class itself
     */

     abstract void call();

     //a concrete or normal method
     void callmetoo(){
        System.out.println("Normal method in java");
     }
}

/*extending  */
class B extends AbClass {
    void call(){
        System.out.println("Forced to implement");
    }
}

class Practice {
    //not possible for an abstract class to make objects
    public static void main(String[] args) {
        B obj = new B();

        obj.call();
        obj.callmetoo();
    }
}