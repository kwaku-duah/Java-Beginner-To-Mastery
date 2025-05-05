package chapt02;

public class IfSample {
    //Demonstrate the if block in java
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y)
            System.out.println("x is less than y");

        x = x * 2;
        
        if (x == y) System.out.println("x is now equal to y");
        
        x = x * 2;
        if (x > y) System.out.println("x is now greater than y");
        
        if (x == y) System.out.println("you won't see this");

    }
}
