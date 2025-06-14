package chapt20;

import java.util.ArrayDeque;

public class ArrayDemoDeque {
    public static void main(String[] args) {
        /*
         * implements no methods of its own
         */
        ArrayDeque<String> test = new ArrayDeque<>();

        //using it as a stack
        test.push("Q");
        test.push("B");
        test.push("C");
        test.push("D");
        test.push("E");
        test.push("F");
        test.push("G");
        test.push("H");

        System.out.println("Display contents for an arraydeque " + test);

        System.out.println("About to pop with pop()");

        while(test.peek() != null) System.out.print(test.pop() + " ");
        System.out.println();
    }
}
