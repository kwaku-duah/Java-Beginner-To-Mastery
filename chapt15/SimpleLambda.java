package chapt15;

public class SimpleLambda {
    // writing a lambda class
    // LHS hold parameter list
    // RHS holds expression body

    // simplest demonstration of a lambda expression
    SimpleLambda() {

    }

    // () -> 123.4;
    // takes no parameters and it returns 123.4

    // this expression is similar to
    double myMeth() {
        return 123.4;
    }

    // () -> Math.random() * 100; //another example of a lambda expression

    //a lambda method that takes a paramter list
    //(n) -> (n % 2) == 0;

    public static void main(String[] args) {

    }

}