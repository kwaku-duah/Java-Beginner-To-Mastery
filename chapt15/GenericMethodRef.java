package chapt15;

//method reference to a generic method

//declared inside a non-generic class

/*generic functional interface that operates on array and 
 * a value and returns an int result
 */
interface TelFunc<T> {
    int func(T[] vals, T v);
}

class ArrayOps {
    // static method with a type parameter signifying it can take array with any
    // data type elements
    static <T> int counterMatching(T[] vals, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++)
            if (vals[i] == v)
                count++;
        return count;
    }
}

public class GenericMethodRef {
    /*
     * this takes a first parameter of a functional interface, and an array and a
     * value of type T
     */
    static <T> int opsMeth(TelFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 5,4};
        String[] sals = {"one", "two", "three", "four", "five", "two"};

        int count;
        count = opsMeth(ArrayOps::<String>counterMatching, sals, "two");
        System.out.println("strs contain " + count + " Twos");

        //integer
        count = opsMeth(ArrayOps::<Integer>counterMatching, vals, 4);
        System.out.println("vals contain " + count + " fours");
    }
}
