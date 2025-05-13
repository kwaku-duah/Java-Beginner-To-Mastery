package chapt06;

class Box {
    double width;
    double height;
    double depth;
}

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //assigning values to the box1
        mybox1.depth = 10;
        mybox1.height = 20;
        mybox1.width = 15;
        
        //cal volume for box1
        vol = mybox1.depth * mybox1.width * mybox1.height;
        System.out.println("Object one :" + vol);

        //assigning values to box2
        mybox2.depth = 3;
        mybox2.height = 6;
        mybox2.width = 9;
        
        //cal volume for box2
        vol = mybox2.depth * mybox2.width * mybox2.height;
        System.out.println("Object two : "+ vol);
    }
}
