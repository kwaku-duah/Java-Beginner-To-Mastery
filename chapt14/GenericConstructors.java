package chapt14;

public class GenericConstructors {
    //it is possible for a constructor to be generic even if its class is not
    private double val;

    <T extends Number>GenericConstructors(T arg) {
        val = arg.doubleValue();
    }

    
}
