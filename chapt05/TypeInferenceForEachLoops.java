package chapt05;

public class TypeInferenceForEachLoops {
    /* demonstrate usage of  inference type var in for each loop */
    public static void main(String[] args) {
        
        /*type inference */
        for (var x = 2.5; x < 100.0; x = x * 2) //this infers from type of var x(initializer of variable) to double
        System.out.println(x);

        int[] nums = {1, 2, 3, 4, 5, 6};
        for (var num: nums) System.out.println(num); //inferred type to be int from the elements in the array
    }

  


}
