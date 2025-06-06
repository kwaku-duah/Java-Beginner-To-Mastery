package chapt07;

import chapt07.InnerNested.Inner;

public class OuterClosedOffInner {
    /*
     * outer enclosing class for inner classes 
     * does not have access to members of the inner class
     */
    int outer_x = 100;

    void Test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int y = 10; //local only to this class

        void display() {
            System.out.println("Getting the outer value " + outer_x);
        }
    }

    void showy(){
        // System.out.println("Attempting to get the value for y: would faild" + y);
        //y is not even visible to this class
    }
}

class Demonstrate {
    public static void main(String[] args) {
        OuterClosedOffInner obj = new OuterClosedOffInner();
    //inner accessing the outer_x
    obj.Test();

    //outer getting inner members is not allowed
    obj.showy();
    }
}
