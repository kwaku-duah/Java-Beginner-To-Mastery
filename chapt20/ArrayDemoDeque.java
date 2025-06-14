package chapt20;

import java.util.ArrayDeque;

public class ArrayDemoDeque {
    public static void main(String[] args) {
        /*
         * implements no methods of its own
         */
        ArrayDeque<String> test = new ArrayDeque<>();

        test.add("Q");
        test.add("B");
        test.add("C");
        test.add("D");
        test.add("E");
        test.add("F");
        test.add("G");
        test.add("H");

        System.out.println("Display contents for an arraydeque " + test);
    }
}
