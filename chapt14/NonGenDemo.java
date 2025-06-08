package chapt14;

class Gen {
    /*all classes are objects of the Object superclass */
    Object ob;

    //constructor that takes reference of an object
    Gen(Object o){
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

}
