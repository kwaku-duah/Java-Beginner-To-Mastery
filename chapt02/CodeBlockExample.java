package chapt02;

public class CodeBlockExample {
    public static void main(String[] args) {
        //Demonstrating practical usage of code blocks
        int x, y;
        y = 20;

        for (x = 0; x < 10; x++) { //Block of code in order to have multi lines
            System.out.println("This is the value of x " + x);

            System.out.println("This is the value of y " + y);

            //influence the iteration of the y variable each time
            y = y -2;
        }
    }
}
