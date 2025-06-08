package chapt14;

class Stats<T> {
    T[] nums; //nums is an array of type T

    //pass constructor a reference of array of type T
    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue(); //errror

            /*stats decides to obtain a double of all elements in the nums array
             * all numeric classes Integer , Double are subclasses of Number and 
             * it has a doubleValue method, but stats has no way of identify whether 
             * they are of numeric type
             * so a way to tell the compiler we intend to pass only numeric types should be
             * established
             */

            return sum / nums.length;
        }
    }
}


public class BoundedTypes {
    /*Bounded types helps in ensuring that a type parameter specific data types
     * it should work with, here is a demonstration where stats call is unbounded
     * and it generates an error
     * 
     */
}
