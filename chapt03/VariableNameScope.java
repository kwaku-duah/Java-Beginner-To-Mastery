package chapt03;

public class VariableNameScope {
    /* you cannot declare a variable to have to have the same name as a variable
     * in its outer scope
     */
    public static void main(String[] args) {
        int bar;
       {
        // int bar; // illegal, variable name has already been used in the outer scope
       }
       

    }
}
