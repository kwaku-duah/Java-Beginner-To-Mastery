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
    //initialized static variable
    static int a = 3;

    //uninitilized static variable
    static int b;

    static void metha(int x){
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("x " + x);
    }

    //opening up a static block to initialize b
    static {
        b = a * 4;
    }

     /*you don have to call the static method in terms of any object
         * they are independent
         * you can only call a static method within the confines of its class
         * so ideally, I would have created another call to make this code 
         * modular but it wont work
         */
//         public static void main(String[] args) {
//             metha(42);
//         }
 }


 /*use a static method outside of the class it is defined
  * you simply call the classname followed by dot operator and method name
   */

   class WillWork{
    public static void main(String[] args) {
        StaticBlock.metha(42);
    }
   }

