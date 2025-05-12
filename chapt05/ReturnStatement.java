package chapt05;

public class ReturnStatement {
    /* simply interprets as what was asked for a method has been achieved, 
     * power moves back to the the caller of the method, nothing after 
     * a return statement is executed
     */
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Before the return ");

        if (t) return; //return to the caller, done with its task

        System.out.println("This will not be printed");
    }
}
