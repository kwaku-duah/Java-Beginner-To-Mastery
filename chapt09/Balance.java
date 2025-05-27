package chapt09;

public class Balance {
    /*playing around packages */
    String name;
    double bal;

    Balance(String n, double b){
        name = n;
        bal = b;
    }

    void show(){
        if (bal < 0) 
            System.out.println("---->");
        System.out.println(name + " :₵ " + bal);
    }
}

class AccountBalance {
   public static void main(String[] args) {
     Balance[] checkBalances = new Balance[3];

    checkBalances[0] = new Balance("J. K. Rowling", 54.67);
    checkBalances[1] = new Balance("Kwaku Duah", 100.99);
    checkBalances[2] = new Balance("General Babanjide", 21.45);

    for (int i = 0; i < checkBalances.length; i++) checkBalances[i].show();
   }
}
