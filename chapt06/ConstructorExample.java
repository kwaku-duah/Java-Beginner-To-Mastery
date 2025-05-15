package chapt06;

public class ConstructorExample {
    /*constructors are special methods that are called immediately an 
     * object is created
     *it has no return type, (implicit return type is of the class type itself
     * has same name as the class and syntactically like a method
     * it basically interprets as, create an object with these default values
     * if you don't define a constructor, java automatically creates one behind
     * the scenes for you, which initializes your instance variables to empty
     */

     //instance variables
     double depth;
     double width;
     double height;

     //constructor for it to be initialized to once an object is being created  [special method]
     ConstructorExample() {
        width = 10;
        depth = 20;
        height = 15;
     }

     //what it can - method
     double volume() {
        return width * height * depth;
     }

     public static void main(String[] args) {
        //Once these objects have being made, they are initialized to the given values
        ConstructorExample box1 = new ConstructorExample();
        ConstructorExample box2 = new ConstructorExample();
        double vol;

        //calculating the volumes
        vol = box1.volume();
        System.out.println("the volume for box 1 is " + vol);

        vol = box2.volume();
        System.out.println("The volume for box 2 " + vol);

     }
}
