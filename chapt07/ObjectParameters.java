package chapt07;

public class ObjectParameters {
    /*
     * passing objects as parameters for objects
     */
    int a, b;

    //constructor(special method)
    ObjectParameters(int i, int j){
        a = i;
        b = j;
    }

    // method that takes (o)which is an instance of class Test, so OBJECT
    boolean equalTo(ObjectParameters o){
        if (o.a == a && o.b == b) return true;
        else return false;
    }


}

class TestExercise {
    public static void main(String[] args) {
    ObjectParameters obj1 = new ObjectParameters(100, 22);
    ObjectParameters obj2 = new ObjectParameters(100, 22);
    ObjectParameters obj3 = new ObjectParameters(22, 100);

    //obj1 compared to obj2
    System.out.println(obj1.equalTo(obj2));

    //obj2 compared to obj3
    System.out.println(obj1.equalTo(obj3));
    }
}
