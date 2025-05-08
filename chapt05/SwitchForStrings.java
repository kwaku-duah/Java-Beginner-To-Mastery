package chapt05;

public class SwitchForStrings {
    /* Switch can be used for strings
     * if not very necessary or already defined strings, avoid it
     * here is how it is used
     */
    public static void main(String[] args) {
        String str = "two";

        switch(str) {
            case "one":
                System.out.println("This is one");
                break;
            case "two":
                System.out.println("This is two");
                break;
            case "three":
                System.out.println("This is three");
            default:
                System.out.println("No match");
        }
    }
}
