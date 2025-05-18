package chapt07;

public class MethodOverload {
    /*
     * a class having two or more methods with the same name in java is called
     * method overloading
     * the methods must have different types or number of parameter declarations
     * for java to be able to differentiate
     * It is an important concept for Polymorphism as one method name, for example
     * car could take parameters gasoline, or electric battery and depending on 
     * what is given in arguments the car gets to behave differently
     */

    void test(){
        System.out.println("No parameters");
    }

    //overload test for one integer parameter
    void test(int a) {
        System.out.println("a: " + a);
    }

    //overload test for two integer parameters
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    //overload test for a double parameter
    void test(double a){
        System.out.println("double: " + a);
    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();

        //invoking all the methos
        obj.test();
        obj.test(7);
        obj.test(10, 20);
        obj.test(25.6);
    }


}
