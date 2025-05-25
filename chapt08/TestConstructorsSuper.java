package chapt08;

public class TestConstructorsSuper {
    //further use of super keyword to initialise all constructors here in a subclass
    double width, depth, height;

    //constructor to clone an object
    TestConstructorsSuper(TestConstructorsSuper obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    //constructor to Test with full given dimensions
    TestConstructorsSuper(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    //constructor to initialise an empty box
    TestConstructorsSuper(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //constructor to Test a cube
    TestConstructorsSuper(double len){
        width = depth = height = len;
    }

    double volume(){
        return width * height * depth;
    }

}

//creating a subclass
class WeightBox extends TestConstructorsSuper{
    //adds its own unique property / variable
    double weight;

    //its own constructor
    WeightBox(double w, double d, double h, double m){
        //use super to Test , streamlines code

        //there has been constructor overloading, the compiler will pickup the one with matching arguments
        super(w, d,h);

        //initialise its own unique attribute
        weight = m;
    }

    //initialise all the other constructors
    //cube
    WeightBox(double len, double m){
        super(len);
        weight = m;
    }
    //initialise empty box
    WeightBox(){
        super();
        weight = -1;
    }

    //clone of an object
    WeightBox(WeightBox ob, double m){
        super(ob);
        weight = m;
    }

}

class TryDemoSee {
    public static void main(String[] args) {


        var obj = new WeightBox();
        var obj1 = new WeightBox(1.2, 23.4, 6.91,34.03);
        var obj2 = new WeightBox(90.7, 76.2);

        var obj3 = new WeightBox(obj1, 34.5);

        System.out.println(obj.volume() + " " + obj.weight);
        System.out.println(obj1.volume() + " " + obj1.weight);
        System.out.println(obj2.volume() + " " + obj2.weight);
        System.out.println(obj3.volume() + " " + obj3.weight);
    }
}
    

