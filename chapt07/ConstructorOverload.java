package chapt07;

public class ConstructorOverload {
    /*
     * constructor overload could help regulate this
     */

     //instance variables

    double width;
    double height;
    double depth;

    //constructors
    ConstructorOverload(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //compute volume
    double volume() {
        return width * height * depth;
    }
}

class ConstructorOverloadDemo {
    public static void main(String[] args) {

        /* this constructor method is very rigid and overloading
         * the constructor can help make the program more robust
         */
        ConstructorOverload obj = new ConstructorOverload(23, 01, 50);
        double result;


        result = obj.volume();
        System.out.println(result);

    }
}
