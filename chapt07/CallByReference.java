package chapt07;

public class CallByReference {
    /*
     * objects passed as parameters are done 
     * through call by reference
     */
    int a, b;

    CallByReference(int i, int j) {
        a = i;
        b = j;
    }

    void methane(CallByReference obj){
        obj.a *= 2;
        obj.b /= b;
    }
}

class TryExercise {
    public static void main(String[] args) {
        CallByReference obj1 = new CallByReference(20, 16);

        System.out.println("Before " + obj1.a + " " + obj1.b);

        obj1.methane(obj1);
        System.out.println("After " + obj1.a + " " + obj1.b);
    }
}
