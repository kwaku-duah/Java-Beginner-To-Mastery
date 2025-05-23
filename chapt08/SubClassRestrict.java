package chapt08;

public class SubClassRestrict {
    /*subclasses cannot access private members of their superclass */
    int i; //default access
    private int j; //local to this class only

    void setij(int x, int y){
        i = x;
        j = y;
    }
}

//subclass
class Unaccessibble extends SubClassRestrict {
    //superclassrestrict's j variable is not accessible here

    int total;
    
    void sum(){
        // total = i + j; //this would not compile
    }
}

class Access {
    public static void main(String[] args) {
        var obj = new Unaccessibble();

        obj.sum();
        System.out.println("this program will not compile because of the access violation of j");
    }
}