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

        //compare two enum values
        if (ap == Apple.Golddel)
            System.out.println("ap contains Goldendel.\n");
            

        //use enum to control a switch statement
        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan is red");
                break;
            case Reddel:
                System.out.println("Reddel is yellow");
                break;
            case Golddel:
                System.out.println("Golddel delicious is red");
                break;
            case Winesap:
                System.out.println("Winesap is red");
                break;
            case Cortland:
                System.out.println("Cortland is red");
                break;
        }
    }
}
