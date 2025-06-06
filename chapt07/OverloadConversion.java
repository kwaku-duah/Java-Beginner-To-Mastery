package chapt07;

public class OverloadConversion {
    /*data conversion also may work in
     * java
     * 
     */
    void test(){
        System.out.println("No parameter");
    }

    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }

    double test(double a){
        return a *a;
    }
}

class MethodBuilding {
    public static void main(String[] args) {
        OverloadConversion obj = new OverloadConversion();
        int i = 90;

        obj.test();
        obj.test(12, 56);

        
        //although there is a type of method being double, int i will be automatically be converted to double, only it matches that method w.r.t to arguments
        System.out.println(obj.test(i));

        //calling it with one parameter again
        System.out.println(obj.test(25.77));
    }
}
