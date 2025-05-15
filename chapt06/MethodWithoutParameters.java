package chapt06;

public class MethodWithoutParameters {
    //method that does not take parameters
    static int square() {
        return 10 * 10;
    }

    //method that takes parameters
    static int square1 (int i) {
        return i * i;
    }

    public static void main(String[] args) {
        
        System.out.println(square());

        System.out.println(square1(10));
    }
}
