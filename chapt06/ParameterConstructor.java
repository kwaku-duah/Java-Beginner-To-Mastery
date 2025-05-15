package chapt06;

public class ParameterConstructor {
    /*parameterized constructors */
    double width;
    double depth;
    double height;

    //constructor with parameters
    ParameterConstructor(double w, double d, double h) {
        width = w;
        depth = d;
        height = h;
    }

    double volume() {
        return width * depth * height;
    }

    public static void main(String[] args) {
        //initializing objects
        ParameterConstructor box1 = new ParameterConstructor(15, 10, 8);
        ParameterConstructor box2 = new ParameterConstructor(13, 56, 23);
        double vol;

        vol = box1.volume();
        System.out.println("The volume of box 1 is " + vol);

        vol = box2.volume();
        System.out.println("This is the box 2 is " + vol);

    }
}
