package chapt08;

public class MethodOverriding {
    /*method overriding simply means that a method in a subclass has the 
     * same name and type signature(same parameter names, order, and type) as 
     * a method in its superclass
     * it hides the method in the superclass
     */
    int i, j;

    MethodOverriding(int a, int b){
        i = a;
        b = j;
    }

    //method with name name show
    void show(){
        System.out.println("The values for i and j property is: " + i + " " + j);
    }
}

//a subclass
class OverRide extends MethodOverriding{
    double k;

    OverRide(int a, int b, double kval) {
        super(a, b);
        k = kval;
    }

    //implementing the concept of override, this will hide the show() in superclass
    void show(){
        System.out.println("The value of k is " + k);
    }
}

class ExampleDemo {
    public static void main(String[] args) {
     

        OverRide see = new OverRide(23, 10, 1.099);
       see.show(); //1.099 clearly overridden the super

        

    }
}