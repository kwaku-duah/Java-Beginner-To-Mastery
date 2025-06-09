package chapt14;


/* a generic subclass can have a non-generic superclass */
class NonaGen {
    int num;

    NonaGen(int i) {
        num = i;
    }

    int getNum() {
        return num;
    }
}

//a generic subclass
class Geni2<T> extends NonaGen {
    T ob;

    Geni2(T o, int i){
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

public class SubclassGen {
    public static void main(String[] args) {
        Geni2<String> w  = new Geni2<String>("Generics Test", 90);

        System.out.println(w.getNum());
        System.out.println(w.getOb());
     
    }
}
