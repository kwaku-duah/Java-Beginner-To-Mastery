package chapt15;

/*lambda that computes the factorial of an int */
interface NumericFun {
    int func(int n);
}

public class BlockLambda {
    // expression of lambda have a block body
    public static void main(String[] args) {
        // reference to a functional interface
        NumericFun factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;

            return result;

        };
        System.out.println("Factorial of three " + factorial.func(3));
        System.out.println("factorial of 5 " + factorial.func(5));
    }
}
