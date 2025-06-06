package chapt03;

public class Block_Scope {
    /* Block and Scoping in java for variables 
     * there can be multiple blocks of code in a scope
     * block is simply opening of a curly brace and ending of it
     * several blocks could be in one class
    */
    public static void main(String[] args) {
        int x; //available to all within

        x = 10;
        if (x == 10) { //start of a scope
            int y = 20; //known only to this block
            
            System.out.println("The values for x and y are " + x +" "+ y);

        }
        // System.out.print("This will give an error " + y) Error! y is not found
        System.out.println("The value of x is still valid and is " + x);
    }
}
