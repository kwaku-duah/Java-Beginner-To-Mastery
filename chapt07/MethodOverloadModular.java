package chapt07;

public class MethodOverloadModular {
    /*modular method overload, to help with code testing
     * reusability
     */
    
     void test(){
        System.out.println("No parameter");
     };

     //two parameters
     void test(int a){
        System.out.println("a: " + a);
     };

     void test(int a, int b) {
        System.out.println("a and b: "+ a + " " + b);
     };

     double test(double a){
        return a*a;
     }
}

//done with the architecture, new sheet for the site to be built
class BuildOverload {
    public static void main(String[] args) {
        MethodOverloadModular obj = new MethodOverloadModular();
        double result;

        obj.test();
        obj.test(3);
        obj.test(39, 56);
        result = obj.test(345.6);
        System.out.println(result);
    }
}
