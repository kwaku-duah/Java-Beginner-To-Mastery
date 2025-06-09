package chapt14;

public class GenMethDemo {
    //determine if an object is in an array
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        /*comparable is an interface in Java.lang
         * and classes that implements defines objects that can actually be compared
         * T is an upperbound of V
         */
        for (int i = 0; i < y.length;i++) 
            if (x.equals(y[i])) return true;

            return false;
    }

    public static void main(String[] args) {
        //use isIn() on integers
        Integer[] nums = {1, 2, 3};

        if(isIn(2, nums)) System.out.println("2 is in nums");
        
        if (!isIn(7, nums)) System.out.println("7 is not in nums");

        //use isIn() on strings
        String[] str = {
            "one", "two", "three"
        };

        if(isIn("one", str)) System.out.println("one is in");

        if(!isIn("seven", str)) System.out.println("seven is not is");

        // if(isIn("three", nums)) System.out.println("fails to compile"); //fails to compare, incompatible data types

    }
}
