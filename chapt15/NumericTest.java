package chapt15;

//double parameterized interface
interface MyNumeric {
    boolean test(int n, int d);
}

public class NumericTest {
    //two parameter lambda
    public static void main(String[] args) {
        MyNumeric isFactor;

        //using lambda to test if one parameter is a factor of the other
        isFactor = (n, d) -> (n % d) ==0;

        if(isFactor.test(10, 10)) System.out.println("Factor of");
        if(!isFactor.test(3, 10)) System.out.println("Not factor of");
    }
}
