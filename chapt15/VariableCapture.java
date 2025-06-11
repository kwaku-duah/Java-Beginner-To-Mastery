package chapt15;

//demonstration between effetively final variables which is required to use lambda and mutable local variables
interface Capture {
    int func(int n);
}

public class VariableCapture {
    //lambda expression have access to local instance variables of its enclosing classes
    //lambda expression onl use variables that are effectively final
    //local variable defined in the enclosing class cannot be modified in the lambda expression

    public static void main(String[] args) {
        int num = 10; //local variable that can be captured

        //number is effectively
        Capture unMutable = (n) -> {
            int v = num + n;

            //attempting to alter the value stored on num, defeats the final status form
            // num++;

        return v;
        };
    }
}
