package chapt09;

public class Protection {
    /*defining all access levels in java */
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    //constructor
    public Protection(){
        System.out.println("base constructor ");

        System.out.println(n);
        
        //same class so n_pri can be accessed
        System.out.println(n_pri);

        System.out.println(n_pro);

        System.out.println(n_pub);
    }
}
