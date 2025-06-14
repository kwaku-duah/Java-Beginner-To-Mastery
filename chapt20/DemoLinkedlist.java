package chapt20;

import java.util.LinkedList;

public class DemoLinkedlist {
    public static void main(String[] args) {
        /*linked list implements the dequeue,list and queue interface 
         * it has great methods like getFirst(), offerFirst() addLast() etc
        */
        LinkedList<String> test = new LinkedList<>();

        //add elements to the linkedlist
        test.add("20");
        test. add("F");
        test.add("E");

        test.add(1, "A2");

        //Original contents of the test
        System.out.println("contents of test " + test);

    }
}
