package chapt08;

public class NameHidingA {
    /*super keyword can be used to overcome name hiding
     * works somewhat as "this keyword", just that this refers to the super
     * keyword
     * name hiding occurs when a member name(intance or method) in a subclass
     * is same as a member name in the super class, super is used to enable
     * the compiler to get a clear distinction of what member is being talked about
     * takes the form super.member
     */

     //default access variable
     int i;

}

class BHide extends NameHidingA{
    int i; //name has being hidden because it exists in both super and sub classes

    BHide(int a, int b){
        super.i = a;  //explicit referral to the value of i in the superclass
        i = b; //known to only subclass
    }

      void showy(){
        System.out.println("Value of a(super.i) = " + super.i);
        System.out.println("Value of B is " + i);
    }
}

class WorkingAB{
    public static void main(String[] args) {
        BHide obj = new BHide(39, 17);

        obj.showy();
    }
}
