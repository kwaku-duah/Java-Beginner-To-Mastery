package chapt15;

/*
 * constructor reference is also available
 * follows this format
 * constructor::new
 */

interface HoldFunc {
    MeClass fun(int n);
}

class MeClass {
    private int val;

    MeClass(int v) {val = v;}

    //default constructor
    MeClass() {val = 0;}

    int getVal() {
        return val;
    }
}


public class ConstructorRef {
    //create a reference to the Myclass constructor
    /* because fun in in the interface requires an argument
     * calling it will refer to the parameterized constructor
     */
    public static void main(String[] args) {
        //interface variable name = constructor name::new
        HoldFunc myTest = MeClass::new;

        //create an instance of Meclass via that constructor
        MeClass mc = myTest.fun(199);

        //use the instance of the just created constructor
        System.out.println("The value is " + mc.getVal());
    }
}
