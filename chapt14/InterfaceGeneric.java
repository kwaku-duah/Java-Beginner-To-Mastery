package chapt14;

interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}

public class InterfaceGeneric<T extends Comparable<T>> implements MinMax<T> {
    // generic interface
    T[] vals;

    InterfaceGeneric(T[] o) {
        vals = o;
    }

    //implementation of methods in the interface
    public T min() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) 
            if (vals[i].compareTo(v) < 0) v = vals[i];

            return v;
    }

public T max() {
    //max method
    T v = vals[0];
    for (int i = 0; i < vals.length; i++)
        if(vals[i].compareTo(v) > 0) v = vals[i];

        return v;

}

}

class GenIfDemo {
    public static void main(String[] args) {
        Integer[] nums = {2, 3, 6, 7};
        Character[] c = {'b', 'r', 'i'};

        InterfaceGeneric<Integer> ob = new InterfaceGeneric<Integer>(nums);
        InterfaceGeneric<Character> ob1 = new InterfaceGeneric<Character>(c);

        System.out.println("Min value in nums " + ob.min());
        System.out.println("Max value in nums " + ob.max());

        System.out.println("Min value in c " + ob1.min());
        System.err.println("Max value in c " + ob1.max());
    }
}
