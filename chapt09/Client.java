package chapt09;

public class Client implements Callback {
    /* for a class to implement an interface it must use the implements keyword
     * all methods in the implementing class must be public
     */

     //implements callback interface 
    public void callback(int p) {
        System.out.println("Satisfy the requirement by the implementing class " + p);
    }

    void IfaceMethod() {
        System.out.println("possible to have its own non-interface method");
    }

}
