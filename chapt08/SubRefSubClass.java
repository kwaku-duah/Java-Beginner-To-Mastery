package chapt08;


public class SubRefSubClass {
    /*Inheritance demonstrated */
    double width, height, depth;

    //constructor for clone of an object
    SubRefSubClass(SubRefSubClass obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    //constructor to initialise box with dimensions
    SubRefSubClass(double w, double d, double h){
        width = w;
        depth = d;
        height = h;
    }

    //constructor to initialise an empty box
    SubRefSubClass(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //constructor to initialise a cube
    SubRefSubClass(double len){
        width = height = depth = len;
    }

    //method to calc volume
    double volume(){
        return width * depth * height;
    }
}

//creating a subclass that inherits from SubRefSubClass and adds a unique attribute specific to it to its attributes
class SubInheritance extends SubRefSubClass{
    double weight;

    //constructor for Box Weight
    SubInheritance(double w, double d, double h, double m) {
        width = w;
        depth = d;
        height = h;
        weight = m;
    }
}

class DemoTrial{
    public static void main(String[] args) {
        //subclass
        SubInheritance obj1 = new SubInheritance(12, 18, 10, 0.007);
        //super class
        SubRefSubClass Superobj2 = new SubRefSubClass();
        double vol;

        vol = obj1.volume();
        System.out.println("Volume of subclass is: "  + vol);
        System.out.println("value of weight in this class is :" + obj1.weight);

        //assign a subclass reference to a superclass reference

        Superobj2 = obj1;

        vol = Superobj2.volume();
        System.out.println("The volume for the box and referenced value: " + vol);

        /*Superobj2 do not have access to weight since it was not initialized there*/
        // Superobj2.weight; //this will fail
 


    }
}
