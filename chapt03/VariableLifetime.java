package chapt03;

public class VariableLifetime {
    /* scope defines the lifetime of a variable ,
     * a variable is created when its scope is entered and
     * destroyed once its scope is left
     * However, for variables with initializers, it is always initialized
     * whenever its scope is entered
     */
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; //initialized each time the scope is entered to minus 1
            System.out.println("The value of y is " + y);
            
            y = 100;
            System.out.println("The value of y is now " + y);
        }
    }
}
