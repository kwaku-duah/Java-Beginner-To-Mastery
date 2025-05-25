package chapt08;

public class TypeSignature {
    /* critically method overloading refers to methods having the same name
     * but different arguments so the compiler infers
     * method overriding means methods in a subclass and superclass have same 
     * names and identical type parameters
     */
    int i, j;

    TypeSignature (int a, int b){
        i = a;
        j = b;
    }

    void show() {
        System.out.println("The values of i and j in superclass " + i + " " + j);
    }
}

class Two extends TypeSignature{
    double k;


    Two(int a, int b, double kval){
        super(a, b);
        k = kval;
    }


    //same method name, but not same type signature
    void show(String para) {
        System.out.println("This is clearly method overload, par difference " + para);
        System.out.println("the values of i, j and k are " + i + " " + " " + j + " " + k);
    }
}

class PracticalTest{
    public static void main(String[] args) {

        var obj = new Two(16, 45, 87.90);
        var obj1 = new Two(43, 65,78.6);

        //this will call the show method with no paramters
        obj.show();

        //this calls the subclasses version of show()
        obj1.show("Subclass version we dey call");
    }
}