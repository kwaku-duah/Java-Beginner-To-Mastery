package chapt12;

public class AutoBox5 {
    /*autoboxing/unboxing also works for boolean and char data types */
    public static void main(String[] args) {
        
        Boolean b = true; //b is wrapped, object b

        //b is unboxed and used in a conditional expression
        if(b) System.out.println("value of b is " + b);

        //autobox/unboxing a character
        Character ch = 'x'; //box 
        System.out.println(ch.getClass());

        char ch2 = ch;

        System.out.println("value of ch2 " + ch2);
        
    }
}
