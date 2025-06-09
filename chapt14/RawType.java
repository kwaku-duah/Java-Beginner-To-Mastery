package chapt14;

class Genie<T> {
    T ob;

    //passing constructor
    Genie(T o) {ob = o;}

    T getOb() {
        return ob;
    }
}

public class RawType {
    /*demonstrating a raw type and legacy code
    generics was introduced post JDK 5, so developers figured out a way to
    make it compatible with legacy code pre-generics
     */
    public static void main(String[] args) {
        //create a Gen object for integers
        Genie<Integer> test = new Genie<Integer>(99);
        

        //Create a gen object for strings
        Genie<String> test1 = new Genie<String>("Generics test");
       
        //creating  a raw-type and giving it value
        Genie raw = new Genie(Double.valueOf(88.3));

        //getting value of raw
        double r = (Double) raw.getOb();
        System.out.println("value " + r);

        // /* the use of raw-type can lead to runtime exceptions */
        // int rb = (Integer) raw.getOb(); //runtime error
        // System.out.println(rb);

        // //assignment
        // test1 = raw;
        // String str = test1.getOb(); //run time error

        // //breaches type safety, encounters an error
        // raw = test;
        // double d = (Double) raw.getOb();
        // System.out.println(d);
    }
}
