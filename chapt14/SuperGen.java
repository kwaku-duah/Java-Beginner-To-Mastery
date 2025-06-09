package chapt14;

class Gen<T> {
    T ob;

    Gen(T o) {ob = o;}

    //return ob
    T getOb(){
        return ob;
    }
}

//subclass
/* whether or not a subclass would use the type parameter, it must pass
 * the T parameters in its super class, it can add its own variables to it too
 */
class Gen2<T, V> extends Gen<T> {

    V ob2;

    Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    //get ob2
    V getOb2() {
        return ob2;
    }
}

public class SuperGen {
    public static void main(String[] args) {
        //creating an object of type gen 2
        Gen2<Integer, String> ob = new Gen2<Integer, String>(88, "Generics Test");

        System.out.println("value is " + ob.getOb());
        System.out.println("value is " + ob.getOb2());
    }
}
