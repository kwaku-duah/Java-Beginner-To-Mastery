package chapt07;

public class MethodReturn {
    /*a method can return any datatype including class type */
    int a;

    MethodReturn(int i){
        a = i;
    }

    MethodReturn incByTen(){
        MethodReturn obj = new MethodReturn(a + 10);
        return obj;
    }
}

class ReturnExercise {
    public static void main(String[] args) {
        MethodReturn first = new MethodReturn(20);

        MethodReturn res;
        res = first.incByTen();

        System.out.println("first.a " + first.a);
        System.out.println("res.a " + res.a);


        
    }
}
