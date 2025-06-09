package chapt14;

/* type inference in java
 * helps in shortening the creation of objects 
 * uses the format
 * class-name<type-args> var-name = new class-name<>() where <> diamond operator
 * that tells the compiler to infer the type from the new declaration
 */

 class MyClass<T, V> {
    T ob1;
    V ob2;

    MyClass(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    boolean isSame(MyClass<T, V> o) {
        if(ob1 == o.ob1 && ob2 == o.ob2) return true;
        else return false;
    }
 }


public class TypeInference {
    public static void main(String[] args) {
        //new modern way to create an instance
        MyClass<String, Integer> mc = new MyClass<>("Generics Test", 88);

        if (mc.isSame(new MyClass<>("Generics Test", 88) )) System.out.println("same");
    }
}
