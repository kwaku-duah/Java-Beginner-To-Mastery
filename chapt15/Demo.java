package chapt15;

//lambda expression that takes a parameter


interface LambdaParameter {
    boolean test(int n);
}

public class Demo {
    public static void main(String[] args) {
        LambdaParameter lam;
        
        // assignment of a reference of 
        lam = (n) -> (n % 2)==0;
        
        //lambda expression implements the test method in the interface
        System.out.println("Is 2 modulo 2 an even number? " + lam.test(2));

    }
}
