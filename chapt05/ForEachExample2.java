package chapt05;

public class ForEachExample2 {
    /* demonstrate ability to end for each loops */
    public static void main(String[] args) {
        int sum = 0;
        int[] nums = {1,2, 3,4, 5, 6, 7, 8, 9, 0};
        
        for(int num: nums) {
            sum += num;
            if (num == 5) break;
            
        }
        System.out.println("output the sum " + sum);

    }
}
