package chapt07;

public class VariableArgs {
    /*legacy code
     * using an array to pass a variable number of arguments
     */
    static void vaTest(int[] v) {
        System.out.println("Number of arguments " + v.length);

        for(int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] n = {1};
        int[] n1 = {1, 2, 4};

    vaTest(n1);
    vaTest(n);
    }
}
