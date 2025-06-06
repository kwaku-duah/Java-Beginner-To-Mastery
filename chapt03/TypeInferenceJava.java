package chapt03;

public class TypeInferenceJava {
    /* type inference in java is used for local variables
     * it is context dependent
     * var cannot be used as a name of class
     * var can be used as name of a variable
     * when var is used with the intention of it being type, you dont specify type again
     */

     public static void main(String[] args) {
        
        var avg = 10.0; // inferencing in java, using it as type
        System.out.println(avg); //this outputs to a double

        int var = 1; //using var as an identifier or name of variable
        System.out.println(var);

        var k = -var; //using var as both type and initializer
        System.out.println(k);

        var myArray = new int[1]; // to declare an array
        /* However you cannot use [] at the left hand side of the equation */
        System.out.println(myArray);

        // var counter; this is wrong, var can only be used to declare a variable only if that variable is initialized
        

     }
}
