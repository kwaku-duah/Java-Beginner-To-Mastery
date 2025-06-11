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

       //using generism to make another method, much flexible
       Mycal<Integer> num = (n) -> {
        int result = 1;

        for (int i = 1; i <= n; i ++)
            result = i * result;

        return result;
       };
       System.out.println("the factorial of 20 is " + num.myNum(5));
    }
}
