package chapt09;

public class InterfReference {
    /*you can use variables of type interfaces to refer to objects
     * 
     */

    public static void main(String[] args) {
        Callback c = new Client();

        c.callback(23);
    }
}
