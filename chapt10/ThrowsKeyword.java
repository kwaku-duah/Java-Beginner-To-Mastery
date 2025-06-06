package chapt10;

public class ThrowsKeyword {
    /* throws keyword is used in method declaration to 
     * allow for all potential errors that can be thrown to be specified
     * it is of the form 
     * type methodName(params-list) throws exception-list(separated by commas)
     * {
     * //body of method
     * }
     */
    // static void demo(){
    //     System.out.println("inside demo");
    //     throw new IllegalArgumentException();
    // }

    // public static void main(String[] args) {
    //     demo();
    // }

    // the above wont work

    static void throwsDemo() throws IllegalArgumentException {
        System.out.println("Inside throws Demo");
        throw new IllegalArgumentException("Holding the error cooly");
    }

    public static void main(String[] args) {
        /* for main to be able to work with it, it must have a try catch block */
        try {
            throwsDemo();
        } catch(IllegalArgumentException e) {
            String  msg = e.getMessage();
            System.out.println(msg);
        }
    }
}
