package chapt20;

import java.util.TreeSet;

/*
 * Tree set is great for sorting, 
 * sorts data and is fast
 */

public class SDemoTreeTest {
   public static void main(String[] args) {
     TreeSet<String> hold = new TreeSet<String>();

    hold.add("A");
    hold.add("B");
    hold.add("C");
    hold.add("D");
    hold.add("E");
    hold.add("F");
    hold.add("A");
    hold.add("5");
    hold.add("a");

    System.out.println("Display the contents " + hold);


    //it implements the navigable interface that has method subSet
    System.out.println(hold.subSet("B", "F"));
   }

    
}
