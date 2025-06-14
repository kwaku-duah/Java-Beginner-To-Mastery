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
    T ob; // declare an object of type T

    // pass the constructor a reference to an object of type T
    Demo(T o) {
        ob = o;
    }

    // Return ob of type T
    T getOb() {
        return ob;
    }

    // show Type of T
    void showType() {
        System.out.println("Show type of T " + ob.getClass().getName());
    }

}

// Demonstrate Generic Class
public class GenDemo {
    public static void main(String[] args) {
        // create a Demo reference where it uses integers
        Demo<Integer> iOb;

        // create a Demo<Integer> object and assign its reference to iOb
        iOb = new Demo<Integer>(88); // auto-boxing of 88 from int to Integer, which encapsulates 88 to become an
                                     // object

        // Demo<Integer> iOb = new Demo<Integer>(99); //same as above

        // show the type of data used by iOB
        iOb.showType();

        // get the value in iOB, notice no casting is done
        int v = iOb.getOb();
        System.out.println("Value is " + v);

        // Creating a Demo object of type String
        Demo<String> strObj = new Demo<String>("Generics Test");

        // show type of data used by strObj
        strObj.showType();

        // get the value in strObj //notice that no cast is need - Again in generics,
        // casting is automatic and implicit
        String str = strObj.getOb();
        System.out.println("Value " + str);
    }
}
