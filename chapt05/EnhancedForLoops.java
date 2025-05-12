package chapt05;

public class EnhancedForLoops {
    /* using for loops for an unsorted array */
    public static void main(String[] args) {
        int[] nums = {6, 8, 3, 5, 3, 1, 3};
        int val = 5;
        boolean found = false;


        for (int num:nums) {
            if (num == val) {
                found = true;
            break;
            }
            
        }
        if (found) System.out.println("value of five has been found");
    }
}
