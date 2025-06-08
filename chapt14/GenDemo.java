package chapt14;

/*Generics was an important addition in Java
 * it allows for classes, interfaces and methods to be defined in a way
 * that is type safe, it can work with all data types
 * generics simply refers to parameterized types
 *
 */

 /*This is a simple generic class
  * T is a type parameter that will be replaced by a real object when
  an object of type Demo is created
  */
 class Demo<T> {
    T ob; //declare an object of type T

    //pass the constructor  a reference to an object of type T
    Demo (T o){
        ob = o;
    }

    //Return ob of type T
    T getOb() {
        return ob;
    }
    
    //show Type of T
    void showType() {
        System.out.println("Show type of T " + ob.getClass().getName());
    }

 }


 //Demonstrate Generic Class
public class GenDemo {
    
}
