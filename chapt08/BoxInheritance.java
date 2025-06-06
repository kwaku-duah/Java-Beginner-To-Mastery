package chapt08;

public class BoxInheritance {
    /*Inheritance demonstrated */
    double width, height, depth;

    //constructor for clone of an object
    BoxInheritance(BoxInheritance obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    //constructor to initialise box with dimensions
    BoxInheritance(double w, double d, double h){
        width = w;
        depth = d;
        height = h;
    }

    //constructor to initialise an empty box
    BoxInheritance(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //constructor to initialise a cube
    BoxInheritance(double len){
        width = height = depth = len;
    }

    //method to calc volume
    double volume(){
        return width * depth * height;
    }
}

//creating a subclass that inherits from BoxInheritance and adds a unique attribute specific to it to its attributes
class SubInheritance extends BoxInheritance{
    double weight;

    //constructor for Box Weight
    SubInheritance(double w, double d, double h, double m) {
        width = w;
        depth = d;
        height = h;
        weight = m;
    }
}

class DemoInheritance {
    public static void main(String[] args) {
        SubInheritance obj = new SubInheritance(20,34 , 350, 078.10);

        var obj1 = new SubInheritance(10, 19, 16, 0.007);

        System.out.println(obj.volume() + " " +  obj.weight);
        System.out.println(obj1.volume() + " " + obj1.weight);
    }
}
