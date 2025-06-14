package chapt20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteraDemo {
    public static void main(String[] args) {
        /*
         * collection has an iterator method for
         * all objects
         * it has hasNext() and next()
         * 
         * collections that implement List has ListIterator
         */

        ArrayList<String> trial = new ArrayList<>();

        // populate an arraylist
        trial.add("A");
        trial.add("B");
        trial.add("C");
        trial.add("D");
        trial.add("F");

        // using iterator to display the date
        System.out.println("Display the list");
        Iterator<String> h = trial.iterator();
        // use hasNext to check if populated
        while (h.hasNext()) {
            String element = h.next();
            System.out.print(element + " ");

        }
        System.out.println();

        //modify the objects being iterated
        ListIterator<String> pc = trial.listIterator();
        while(pc.hasNext()) {
            String element = pc.next();
            pc.set(element + "+");
        }

        //modiied contents of al
        h = trial.iterator();
        while (h.hasNext()) {
            String element = h.next();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
