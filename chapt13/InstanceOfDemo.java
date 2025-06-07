package chapt13;

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}




public class InstanceOfDemo {
    /*instanceof is used to obtain an objects type during runtime
     * helpful to prevent runtime errors in the case of casting
     * takes the format
     * objref instance of type where
     * objref is a reference to the instance of a class and type is the type of
     * of the objref or class or a type that the object can be cast to if compatible
     */
 public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    D d = new D();

    if (a instanceof A) System.out.println("a is an instance of A");
    if (b instanceof B) System.out.println("b is an instance of B");
    if (c instanceof C) System.out.println("c is an instance of C");

    //in java all subclasses are instances of its superclasses
    if (c instanceof A) System.out.println("c can be cast to A");

    if (a instanceof C) System.out.println("a can be cast to C"); //does it print, it evals to false

    System.out.println();

    //comparing types of derived types
    A ob;

    ob = d; //A now refers to d
    
    if (ob instanceof D) System.out.println("ob now refers to D");
    System.out.println();

    ob = c; // A reference now points to C
    if (ob instanceof C) System.out.println("ob now refers to C");

    if (ob instanceof D) System.out.println("ob is an instance of D");
    else System.out.println("ob is not an instance of D");

    if (ob instanceof A) System.out.println("ob can be cast to A");

    //all objects can be cast to Objects
    if (a instanceof Object) System.out.println("a may be cast to Object");
    if (b instanceof Object) System.out.println("b may be cast to Object");
    if (c instanceof Object) System.out.println("c may be an instance of Object");
    if (d instanceof Object) System.out.println("d may be an instance of Object");
 }

}
