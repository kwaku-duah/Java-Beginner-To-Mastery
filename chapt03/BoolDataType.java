package chapt03;

public class BoolDataType {
    /* This datatype has only two possible forms, true/false
     * it can only be used in relational problems or control statements 
     * in loops
     * This is a demonstration of how it works
     * main method declaration
     */
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is " + b);

        b = true;
        System.out.println("b is " + b);


        //for control statements
        if (b) System.out.println("This is executed ");

        b = false;
        if (b) System.out.println("This is not executed ");

        //For relational problems
        System.out.println("10 > 9 is " + (10 > 9));

    }
   
}
