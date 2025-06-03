package chapt12;

public class DemoEnumeration {
    /*enumeration is very important in the context of java
     * it refers to a list of named constants and its legal values
     * it define a class type
     * enumerations can have constructors, methods and instance variables, 
     * making it extremely powerful
     * enumeration is created using the enum keyword
     */

     //demo
     enum Apple {
        Jonathan, Golddel, Reddel
     }

     /* Jonathan,Golddel are enumeration constants
      * enumeration is a special kind of class
      they are implicity final, static and final and of the type of the enclosing 
      enumeration in which they are declared, here of type Apple, they are self-type
      */

      /*
       * after creating an enumeration, a reference variable can be created to reference it
       * 
       */
      Apple ap; //ap is a reference of type Apple

      //ap can hold values of only values defined in apple
     ap = DemoEnumeration.Apple.Golddel;

     //enumeration constants can also be compared with the relational operator
     if(ap == Apple.Golddel);

     
}
