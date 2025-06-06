package chapt09;

public class NestedInterface {
    /*nested interfaces can be members of a class or interfaces
     * they can be referenced only through their defining classes
     */
    public interface NestIF {
        boolean isNotNegative(int x);
    }
}

class B implements NestedInterface.NestIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false: true;
    }
}

class Check {
    public static void main(String[] args) {
        NestedInterface.NestIF nif = new B();

        if (nif.isNotNegative(23)) 
            System.out.println("This will print...");

        if(nif.isNotNegative(-12))
        System.out.println("this will not display");
    }
}
