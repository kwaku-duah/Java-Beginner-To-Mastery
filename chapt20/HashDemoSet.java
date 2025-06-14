package chapt20;

import java.util.HashSet;

public class HashDemoSet {
    public static void main(String[] args) {
        /*
         * Hashset is a generic class under collections
         * does not do sorting and does not have any additional methods
         */
        HashSet<String> as = new HashSet<>();

        as.add("F");
        as.add("E");
        as.add("A");
        as.add("C");
        as.add("P");
        as.add("Q");
        as.add("M");

        System.out.println("list members " + as);
        
    }
}
