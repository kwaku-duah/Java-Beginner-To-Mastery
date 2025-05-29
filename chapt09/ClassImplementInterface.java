package chapt09;

//a class that implements an interface that has being extended
public class ClassImplementInterface implements ExtendInterface {
    
    /* forced to implement method in the OneInterface and ExtendInterface */
    public void meth1() {
        System.out.println("Satisfied abstract method 1");
    }

    public void meth2() {
        System.out.println("Satified abstract method 2");
    }

    public void meth3() {
        System.out.println("Satisfied method 3 implementation");
    }
}
