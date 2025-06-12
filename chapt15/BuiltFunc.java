package chapt15;
/*java has a built in functional interfaces ready for consumption */

import java.util.function.Function;

public class BuiltFunc {
    public static void main(String[] args) {
        Function<Integer, Integer> test = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Factorial of three is " + test.apply(5));
    }
}
