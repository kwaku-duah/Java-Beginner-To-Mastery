package chapt12;

/*autoboxing and auto-unboxing in java */
public class Autobox2 {
    //take an Integer parameter and return primitive int

    static int m(Integer v) { //receive an object
        return v; //auto-unbox to inbox
    }

    public static void main(String[] args) {
        /* pass int to m and assign return value to Integer */
        Integer iOB = m(100); //autobox 100 to Integer

        System.out.println(iOB);
    }
}
