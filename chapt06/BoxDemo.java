package chapt06;

class Boxable {
    double width;
    double height;
    double length;
};

public class BoxDemo {
    public static void main(String[] args) {
        Boxable mybox = new Boxable();
        double vol;

        /* assigning values to the instance variables of Box 
         * uses the name/identifier of class then (separator) or
         * dot notation(.) then variable then = value
        */
        mybox.width = 100;
        mybox.height = 10;
        mybox.length = 20;

        vol = mybox.width * mybox.height * mybox.length;
        System.out.println(vol);

    }
}
