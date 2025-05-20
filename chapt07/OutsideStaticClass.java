package chapt07;

public class OutsideStaticClass {
    /*accessing static methods and variables in other classes */
    static int a = 25;
    static int b = 57;

    static void callme(){
        System.out.println("a " + a);
    }
}

class WorkGood {
    public static void main(String[] args) {
        OutsideStaticClass.callme();

        System.out.println("b"+OutsideStaticClass.b);
    }
}
