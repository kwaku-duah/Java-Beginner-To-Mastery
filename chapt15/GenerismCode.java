package chapt15;


/*a lambda expression cannot be generic because it does not define any type 
parameters
However a functional interface can 
 * 
 */

interface Mycal<T> {
    T myNum(T o);
}

public class GenerismCode {
    public static void main(String[] args) {
       //string based version

       Mycal<String> str = (n) -> {
        String reverse = "";
        int i  = 1;
        for (i = n.length() -1; i >= 0; i--)
            reverse += n.charAt(i);

        return reverse;
       };

       System.out.println("Reverse my name " + str.myNum("abc"));
    }
}
