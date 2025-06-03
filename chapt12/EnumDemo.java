package chapt12;

enum Apple {
    Jonathan, Golddel, Reddel, Winesap, Cortland
}


public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.Reddel;
        System.out.println("Value of ap " + ap);
        System.out.println();

        ap = Apple.Golddel;
    }
}
