package chapt18;

public class BufferString {
    public static void main(String[] args) {
        //string buffer methds length and capacity
 
        StringBuffer test = new StringBuffer("Hello");
       int q = test.length();
       int a = test.capacity();
       System.out.println(a + " " + q);
    }
}
