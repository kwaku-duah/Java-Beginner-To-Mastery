package chapt06;

public class BoxExampleReturn {
    /*using return to store or keep values */

    //instance variables
    double depth;
    double width;
    double length;

    //methods that returns a value back to the caller
    double volume(){
        return width * length * depth;
    }

    public static void main(String[] args) {
        //create objects
        BoxExampleReturn box1 = new BoxExampleReturn();
        BoxExampleReturn box2 = new BoxExampleReturn();

        //give specifications for box1
        box1.depth = 30;
        box1.length = 10;
        box1.width = 3;

        //give specifications for box2
        box2.depth = 3;
        box2.length = 10;
        box2.width = 23;

        //calculate the volume for the box1
        double vol1 = box1.volume();
        System.out.println("The volume for the box 1 " + vol1);

        //calculate the volume for the box2
        double vol2 = box2.volume();
        System.out.println("The volume for the box 2 " + vol2);


    }
}
