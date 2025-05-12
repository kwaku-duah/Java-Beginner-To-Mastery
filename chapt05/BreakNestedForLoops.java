package chapt05;

public class BreakNestedForLoops {
    /* if break is used in nested for loop,it only terminates that inner loop */
    public static void main(String[] args) {
        int i, j;

        for (i = 0; i < 3; i++) {
            System.out.println("these are values for i: " + i);
            for (j = 0; j < 100; j++) {
                if (j == 10)
                    break; // breaks only this loop
                System.out.print("these are values of j: " + j);
                System.out.println();
            }
        }
        System.out.println("Loop done!");
    }
}
