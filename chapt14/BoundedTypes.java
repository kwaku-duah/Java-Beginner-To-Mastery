package chapt14;


//defining type parameter where you specify types you want or its subclasses is called the boundary types
//it is done by using the extends clause superclass or subclasses under the superclass
class Stats<T extends Number> {
    T[] nums; //nums is an array of type T

    //pass constructor a reference of array of type T
    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) 
            sum += nums[i].doubleValue(); //errror

            /*stats decides to obtain a double of all elements in the nums array
             * all numeric classes Integer , Double are subclasses of Number and 
             * it has a doubleValue method, but stats has no way of identify whether 
             * they are of numeric type
             * so a way to tell the compiler we intend to pass only numeric types should be
             * established
             */

            return sum / (nums.length);
        
    }

       //method to compare  two stats objects
       /*the average of that argument against  the invoking
        * however this is narrow and only works when the argument is of same type as the invoking object
        this is linear, for a generic solution, we must use the wild cards
       */
       boolean isSameAverage(Stats<T> ob) {
        if (average() == ob.average()) return true;
         return false;
       }

       //solving this issue with wilcards which takes the form (?) and specifies unknown type
       boolean isSameAverageWildCard(Stats<?> ob) {
        if(average() == ob.average()) return true;
        return false;
       }
}


public class BoundedTypes {
    /*Bounded types helps in ensuring that a type parameter specific data types
     * it should work with, here is a demonstration where stats call is unbounded
     * and it generates an error
     * 
     */
    public static void main(String[] args) {

        Integer[] first = {1, 2, 3, 4, 5};
        Stats<Integer> ob = new Stats<Integer>(first);

        double v = ob.average();
        System.out.println("ob average is " + v);

        //trying double
        Double[] dnums = {1.0, 2.0, 3.0, 4.0, 5.0};
        Stats<Double> ob1 = new Stats<Double>(dnums);

        double v1 = ob1.average();
        System.out.println("dob average is " + v1);

        //trying for floats
        Float[] f = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<Float>(f);

        float fb = (float) fob.average();
        System.out.println("float value is " + fb);


        System.out.println("Testing");
        System.out.println(ob1.isSameAverage(ob1)); //this works but not for any other data types, solution is wildcard arguments


        /* the wildcard in there does not tell the type to the compiler, it just
         * works with the types so far they are from the same superclass and converge to one type
         */
        if (ob.isSameAverageWildCard(ob1)) {
            System.out.println("The averages are the same");
        } else {
            System.out.println("They are not the same");
        }

        //testing for comparability for floats
        if (fob.isSameAverageWildCard(ob)) {
            System.out.println("same");
        }
        else {
            System.out.println("not same");
        };

        // //trying a string object, won't compile
        // String[] str = {"1", "2", "3", "4", "5"};
        // Stats<String> ob2 = new Stats<String>(str)  //bound mismatch, because String is not a subclass of number

        // double x = ob2.average();
        // System.out.println("ob " + x);




        
    }
}
