package chapt13;

public class AssertDemo {
    /*assert keyword is used to demonstrate an assertion
     * it takes the form 
     * assert condition, where condition evals to boolean
     * if it evals to true, nothing is done, otherwise, an AssertError is thrown
     * 
     * it also has another format
     * assert condition: expres;
     * where expression takes a value, non-void value that will be thrown 
     * when it fails
     */
    static int val = 3;

    static int getNum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 10; i++) {
            n = getNum();

            //demonstrate use of assert keyword
            assert n > 0: "assert is not positive";
            System.out.println("n is " + n);
        }
    }

}
