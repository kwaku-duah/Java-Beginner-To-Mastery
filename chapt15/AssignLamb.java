package chapt15;


interface FuncInterface {

    //functional interface contains only one abstract method (implicitly abstract)
    abstract double getValue();

    //this is implicitly abstract and the function is getValue();
}

public class AssignLamb {
    //reference to instance variable for the interface
    FuncInterface refFun;

    //implementation in a constructor
    public AssignLamb(){
         refFun = () -> 123.4;
    }

   

    public static void main(String[] args) {
        AssignLamb ob = new AssignLamb();
        System.out.println(ob.refFun.getValue());
    }
}





