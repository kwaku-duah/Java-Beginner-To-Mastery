package chapt12;

enum Apples {
    Jonathan(10), GoldenDel(9), /*RedDel(12)*/ RedDel, Winesap(15), Cortland(8);

    private int price;

    Apples(int p) {
        price = p;
    }

    // could also take multiple constructors
    Apples() {
        price = -1; // in an unusable state
    }

    public int getPrice() {
        return price;
    }
}

public class NewEnum {
    public static void main(String[] args) {

        // Display price of Winesap
        System.out.println("Winesap costs " + Apples.Winesap.getPrice() + " cents.\n");

        // Display all apple prices
        System.out.println("All apple prices:");
        for (Apples a : Apples.values()) {
            System.out.println(a + " costs " + a.getPrice() + " cents.");
        }
    }
}
