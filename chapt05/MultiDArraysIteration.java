package chapt05;

public class MultiDArraysIteration {
    /* iterating over multi dimensional arrays */
   public static void main(String[] args) {
    int[][] nums = new int[3][4];
    int sum = 0;

    for (int i = 0; i < 3; i++)
        for (int j =0; j < 4; j++)
        nums[i][j] = i*1 + j*1;   
        
    for (int[] x: nums){
        
        for (int y: x) {
            sum += y;
        System.out.println(y);

        }
    }
    System.out.println(sum);
   }
   
   
}
