package chapt15;

//reverse a string
interface StringReverse {
    String revString(String n);
}

public class ReverseString {
    public static void main(String[] args) {
        StringReverse revS = (n) -> {
            String reverse = "";
            int i;
            for (i = n.length() - 1; i >= 0; i--)
                reverse += n.charAt(i);

            return reverse;
        };
        System.out.println("reverse characters " + revS.revString("hello"));
        System.out.println("reverse my name " + revS.revString("Duah"));
    }
}
