package chapt05;

public class CommaLoops {
    /*using commas in both the initialization phase and iteration parts of code */
    public static void main(String[] args) {
        int a, b;

        for (a = 1, b = 4; a < b; a++, b--){
            System.out.println("a is " + a);
            System.out.println("b is b " + b);
        }
    }
}
