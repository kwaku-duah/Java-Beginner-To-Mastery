package chapt03;

public class ArrayOversize {
    public static void main(String[] args) {
        double[] nums = {10.1, 11.2, 12.3, 13.4,14.5};
        double result = 0;
        int i;

        for (i = 0; i < 5; i++) result = result + nums[i];
        System.out.println("The average value is " + result / 5);
        System.out.println("This should give an error, indexOutOfBounds " + nums[5]);
    }
}
