package chapt12;


enum Fruits {
    Jonathan, RedDel, Golddel, Winesap, Cortland
}


public class EnumDemo4 {
    /*demontration of methods in Enumeration class which enum inherits inherits from
     * ordinal() returns the position of an enum constant
     */
    public static void main(String[] args) {
        Fruits ap, ap1, ap2;

        System.out.println(
            "Here are all fruit constants " + " their ordinal values"
        );

        //returns int position of all enumeration
        for (Fruits a: Fruits.values()) System.out.println(a + " Constant and " + a.ordinal());

        ap = Fruits.Cortland;
        ap1 = Fruits.Golddel;
        ap2 = Fruits.Jonathan;

        System.out.println();
    }
}
