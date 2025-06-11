package chapt15;

//usage of lambda expression as an argument in a method
interface StringFunc {
    String func(String n);
}

public class ArgLambda {
    /*
     * this method has a functional interface as its first parameter
     * it can therefore be passed a reference to any instance of that
     * interface
     * including an instance created by a lambda expression
     * second parameter specifies string to work on
     */
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String instr = "Lambdas improve the the expressive power of java";
        String outstr;

        System.out.println("Print out " + instr);

        // a string lambda that uppercases a string is passed to a stringOp (lambda
        // expression as a method argument)
        outstr = stringOp((n) -> n.toUpperCase(), instr);
        System.out.println("String in uppercase " + outstr);

        // block lambda expression that removes spaces
        outstr = stringOp((n) -> {
            String result = "";
            int i;

            for (i = 0; i < n.length(); i++)
                if (n.charAt(i) != ' ')
                    result += n.charAt(i);
            return result;
        }, instr);
        // stringOp method requires two parameters
        /* lambda method allows an executable code to be an argument */
        System.out.println("String with spaces removed " + outstr);

        // passing an instance of a StringFunc in a lambda expression already
        // implemented

        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println(
                "Demonstration of passing an already created lambda expression as an arg " + stringOp(reverse, instr));
    }

}
