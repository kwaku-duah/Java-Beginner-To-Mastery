package chapt14;

class Hierarch<T> {
    T ob;

    Hierarch(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

// subclass of hierarch
class InstanceHierarch<T> extends Hierarch<T> {

    InstanceHierarch(T o) {
        super(o);
    }
}

public class HierRuntime {
    // finding out instance of objects during runtime with instanceof for generic
    // classes
    public static void main(String[] args) {
        // gen one object
        Hierarch<Integer> w1 = new Hierarch<Integer>(88);

        // gen2 object
        InstanceHierarch<String> w2 = new InstanceHierarch<String>("Generics test");

        // check if w1 is same form as w2
        if (w1 instanceof Hierarch<?>)
            System.out.println("w1 is an instance of Hierarch<?>");

        System.out.println();

        // check if w2 is of form InstanceHierach
        if (w2 instanceof InstanceHierarch<?>)
            System.out.println("w2 is an instance of InstanceHierarch<?>");

        // check if w2 is an instance of Hierarch
        if (w2 instanceof Hierarch<?>)
            System.out.println("is str object w2 an instance of Hierarch<?> - this is true");

        // check if w1 is an instance of InstanceHierarch
        if (w1 instanceof InstanceHierarch<?>)
            System.out.println("is w1 a str object of instance InstanceHierach<?> - this is false, won't be printed");

    }
}
