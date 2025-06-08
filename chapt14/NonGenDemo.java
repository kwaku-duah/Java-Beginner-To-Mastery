package chapt14;

class NonGen {
    /*all classes are objects of the Object superclass */
    Object ob;

    //constructor that takes reference of an object
    NonGen(Object o){
        ob = o;
    }

    //Show type of ob
    void showType() {
        System.out.println("The type of ob is " + ob.getClass().getName());
    }

    //get value of ob
    Object getOb(){
        return ob;
    }
}

public class NonGenDemo {
    /*it is possible to do the same thing generics does by using type Object
     * the downside is that, you would have to do type checking to ensure 
     * type safety and also you have to do manual casting
     * 
     */
    public static void main(String[] args) {
        NonGen iOb;

        //create a nongen object and store an Integer in it
        iOb = new NonGen(88); //autoboxing still occurs

        //show type of data used by iOb
        iOb.showType();

        //get the value of iOb
        int v = (Integer) iOb.getOb(); //this time a cast is necessary
        System.out.println("Value " + v);

        System.out.println();

        //create another non-gen object and store a string in it
        NonGen str = new NonGen("Non Generics test");

        //show type of data in str
        str.showType();

        //get value in stored in str
        String strObj = (String) str.getOb(); //notice that a cast is necessary
        System.out.println("Value " + strObj);

        /* it is not acceptable to link two references of object with different
         * type arguments or references in this regard like ( Integer instantiation of object) and
         * and then (String ) instantiation of object, it is logically wrong and does not work
         */

        // //  iOb = str; //compiles because they are of the same type NonGen but is conceptually wrong
        // //  v = (Integer) iOb.getOb(); /*this compiles but crashes at runtime
        // //  because iOb has been redirected to point to an object of type of type String
        //  now I am telling it to cast the value (which now points to string to Integer)
        //  */



    }
}
