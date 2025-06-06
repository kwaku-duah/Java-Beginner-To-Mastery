package chapt09;

public interface DefaultInterface {
    /*interfaces do not fully implement methods
     * however, there is a default method that adds flexibility
     * so methods that implements has optionally the power to implement or not
     * and there will be no error
     * default interface methods are preceded by default keyword
     */

     //normal interface method, with no body
     int normalMethod();

     //default interface method definition
     default String defaultMethod() {
        return "Default String";
     }
}
