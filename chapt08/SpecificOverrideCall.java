package chapt08;

public class SpecificOverrideCall {
    /* to specifically access an overriden method explicitly
     * use super
     */
    int i, j;

    SpecificOverrideCall(int a, int b){
        i = a;
        j = b;
    }

    void show(){
        System.out.println("The value for i and j: " + i + " " +  j);
    }
}

class AttemptA extends SpecificOverrideCall{
    double k;

    AttemptA(int a, int b, double kval){
        super(a, b);
        k = kval;
    }

    void show(){
        super.show(); //called the method from its superclass so this will work
        System.out.println("The value of K is: " + k);
    }
}

class Etest {
    public static void main(String[] args) {
        AttemptA see = new AttemptA(32, 76, 54.67);

        see.show();
    }
}