package chapt12;


enum Fruits {
    Jonathan, RedDel, Golddel, Winesap, Cortland
}


public class EnumDemo4 {
    /*demontration of methods in Enumeration class which enum inherits inherits from
     * ordinal() returns the position of an enum constant
     */
    public static void main(String[] args) {
        Fruits ap, ap1, ap2, ap3;

        System.out.println(
            "Here are all fruit constants " + " their ordinal values"
        );

        //returns int position of all enumeration
        for (Fruits a: Fruits.values()) System.out.println(a + " Constant and " + a.ordinal());

        ap = Fruits.Cortland;
        ap1 = Fruits.Golddel;
        ap2 = Fruits.Jonathan;
        ap3 = Fruits.Cortland;

        System.out.println();

        //Demonstrate compareTo
        if (ap.compareTo(ap2) < 0) System.out.println(ap + " comes before ap2 " + ap2); 
        if (ap.compareTo(ap2) > 0) System.out.println(ap2 + " comes before " + ap);

    
        if (ap.compareTo(ap3) == 0) System.out.println(ap + " equals " + ap3);

        //equals method
         if (ap.equals(ap2)) System.out.println("Error!");

         if(ap.equals(ap3)) System.out.println(ap + " equal to " + ap3);

         if (ap == ap3) System.out.println(ap + " equal to " + ap3);
    }


   
}
