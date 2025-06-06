package chapt07;

public class RecursiveCall {
    /*defined as something that is defined interms of itself
     * 
     */
    //recursive method
    int fact(int n){
        int result;

        //if n == 1 terminates, else the method calls itself
        if (n==1) return 1;
        result = fact(n-1) *n;
        return result;
    }
}

class Factorial {
    public static void main(String[] args) {
        RecursiveCall obj = new RecursiveCall();

        System.out.println("factorial of 3 is " + obj.fact(3));
    }
}
