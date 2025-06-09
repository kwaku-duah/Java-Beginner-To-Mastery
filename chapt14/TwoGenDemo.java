package chapt14;

/*declaring generic types with two type parameters is acceptable */
class TwoGen<T, V> {
    T ob1;
    V ob2;

    // constructor with reference to two types
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    // show types of objects of T and V
    void showType() {
        System.out.println("Return type of T " + ob1.getClass().getName());
        System.out.println("Return type of V " + ob2.getClass().getName());

    }

    // get values of ob1 and ob2
    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

 

}

public class TwoGenDemo {

    public static void main(String[] args) {
        // initializing real object with TwoGen
        TwoGen<Integer, String> ob = new TwoGen<Integer, String>(88, "Generics two type parameter check");

        // show the type of objects
        ob.showType();

        //get the values 
        int v1 = ob.getOb1();
        System.out.println("Value ob1 " + v1);

        String v2 = ob.getOb2();
        System.out.println("Value ob2 " + v2);

        var v3 = ob.getOb1();
        System.out.println("Using var so I dont have to think " + v3);
    }


}
