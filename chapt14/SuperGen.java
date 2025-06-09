package chapt14;

class Gen<T> {
    T ob;

    Gen(T o) {ob = o;}

    //return ob
    T getOb(){
        return ob;
    }
}

//subclass
class Gen2<T> extends Gen<T> {

    Gen2(T o) {
        super(o);
    }
}

public class SuperGen {
    
}
