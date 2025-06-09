package chapt14;

public class GenericConstructors {
    //it is possible for a constructor to be generic even if its class is not
    private double val;

    <T extends Number>GenericConstructors(T arg) {
        val = arg.doubleValue();
    }

    void showValue(){
        System.out.println("val is " + val);
    }

}

class ConstructorGen {
    public static void main(String[] args) {
        GenericConstructors ob = new GenericConstructors(12);
        GenericConstructors ob1 = new GenericConstructors(123.8F);

        ob.showValue();
        ob1.showValue();
    }
}
