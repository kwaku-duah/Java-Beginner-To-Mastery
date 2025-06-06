package chapt05;

public class ForEachLoop {
    /*demonstration of how for each loop works
     * works like:
     * for (type iteration-value:collection) statement-block
     */
   public static void main(String[] args) {
    int sum = 0; 
    int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    for(int num: nums) sum += num;
    System.out.println("sum of the one dimensional array is " + sum);
   }
}
