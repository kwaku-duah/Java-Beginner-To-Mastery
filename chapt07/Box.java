package chapt07;

public class Box {
    /*objects as a parameters are mostly used in constructors
     * this helps to make new objects that are already in some state
     * more efficient coding
     */

    //instance variables
    double width, height, depth;

    //constructor takes an object
    Box(Box obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    //initialize to take three parameters
    Box(double w, double h, double d){
        width = w;
        depth = d;
        height = h;
    }

    //initialize object to empty or unusable
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //initialise to cube
    Box(double len){
        width = depth = height = len;
    }

    double volume() {
        return width * depth * height;
    }
}

class BoxTest {
    public static void main(String[] args) {
        Box obj1 = new Box(10.0, 12.2, 23.56);
        Box obj2 = new Box();
        Box obj3 = new Box(45.6);
        double vol;

        //then now making a new box out of an existing box == CLONING
        Box obj4 = new Box(obj1);

        vol = obj1.volume();
        System.out.println("Vol for obj1 is " + vol);

        vol = obj2.volume();
        System.out.println("Vol for obj2 " + vol);

        vol = obj3.volume();
        System.out.println("volume for obj3 " + vol);

        vol = obj4.volume();
        System.out.println("obj1 == object 4: " + vol);
        
    }
}