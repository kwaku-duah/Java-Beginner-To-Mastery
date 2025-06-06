package chapt07; // should not be in a package

public class CommandlineArguments {
    /*commandline arguments in java
     * they are inputs required before a program runs
     * mostly entered in the terminal or command prompt
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            System.out.println("[args " + i + "]:" + args[i] );
        }
    }
}
