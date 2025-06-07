package chapt13;

public class SystemWrite {
    /*for character based streams, we can make use of low-level
    write method write(), system.out.write()
    write() can also be used to write to the console
     */
    public static void main(String[] args) {
        int b;
        //remember underhood, int and char have a relation
        b = 'A';
        System.out.write(b);
        System.out.write('\n');
    }
}
