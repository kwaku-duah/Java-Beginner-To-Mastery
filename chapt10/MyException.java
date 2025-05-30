package chapt10;

public class MyException extends Exception {
    /*Exceptions in java and creating your own custom exception and
     * overriding the toString() for a customized message
     */
    private int detail;

    MyException(int a) {
        detail = a;
    }

    /*errors are objects in Java
     * all objects have a toString() methods
     */
    public String toString(){
        return "MyException["+ detail + "]";
    }


}

class ExceptionDemo  {
    static void demoClass(int a) throws MyException{
        System.out.println("the value of a is " + a);
        if (a > 10)
        throw new MyException(a);
        System.out.println("Normal exit");
    }

    public static void main(String[] args) {
        try{
            demoClass(20);
            demoClass(15);
        } catch(MyException e) {
           System.out.println("Caught " + e);
        }
    }
}
