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

        //check non-even
        if(lam.test(20)) System.out.println("It is not, this should print");

        //use lambda expression to test if a number is non negative
        LambdaParameter pam = (n) -> (n) >0;
        if(pam.test(10)) System.out.println("Non-negative");

    }
}
