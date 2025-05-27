package chapt09_1;

public class CreateBalance {
    //public class, public constructors and public method
    String name;
    double bal;

    public CreateBalance(String m, double b){
        name = m;
        bal = b;
    }

    public void show() {
        if (bal < 0) 
            System.out.println("----->");
        System.out.println(name + ": ₵" + bal);
    }
}
