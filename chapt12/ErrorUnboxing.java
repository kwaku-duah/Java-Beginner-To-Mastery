package chapt12;

public class ErrorUnboxing {
    /*showing significant effect of a manual boxing/unboxing in java */
    public static void main(String[] args) {
        Integer ioB = 1000;

        int i = ioB.byteValue(); //wrong unboxing

        System.out.println(i);
    }
}
