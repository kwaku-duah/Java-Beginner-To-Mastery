package chapt09;

public class AnotherClient implements Callback{

    
    public void callback(int p) {
        System.out.println("testing to see");
        System.out.println("square of p is " + (p*p));
    }
}

class IfaceTest {
    public static void main(String[] args) {
        Callback c = new Client();
       AnotherClient obj = new AnotherClient();

       c.callback(45);

       c = obj;
       //reference c of type interface to obj of type class
       c.callback(30);

    }
}
