package chapt07;

public class StaticBlock {
    /* keyword static is only for instance variables or methods that can 
    be used independently of an object of the class
    static variables are essentially global variables
    each instance of the class have the static variable
    to initialize a static variable, you declare declare a static block
    which takes form static {
        //initialization
    }
     * static method can access only other static methods or variables of that class
     * static methods cannot refer to any instance with "this" or "super"(used) in inheritance
     * because they refer to objects, whereas static cannot be used in any context of an object
     */
}
