package chapt10;

public class MethNestTry {
    /*a try in a method which is then placed/ called in a try catch */

    static void tryTest(int a) {
        try {
            if (a ==1 ) a = a / (a-a); //zero division

            if (a == 2) {
            int[] c = { 1 };
            c[32] = 99; //generate out of bounds exception
        } 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index " + e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 10 /a; //give arithmeticexception error

            System.out.println("a = " + a);
            
            tryTest(a);
        } catch (ArithmeticException e) {
            System.out.println("error " + e);
        }
    }
}


