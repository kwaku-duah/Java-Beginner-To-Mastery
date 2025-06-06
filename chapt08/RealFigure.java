package chapt08;

abstract public class RealFigure {
    /* classic use case of an abstract class*/
    double dim1, dim2;

    RealFigure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    //method we cannot fully define here but need all extending classes to 
    abstract double area();

}

class FigRect extends RealFigure{
    
    FigRect(double a, double b){
        super(a,b);
    }

    double area() {
        System.out.println("area of rectangle implemented to satisfy superclass condition");
        return dim1 * dim2;
    }
}

class FigTriangle extends FigRect{

    FigTriangle(double a, double b){
        super(a, b);
    }

    //triangle of a figure
    double area() {
        System.out.println("area of a triangle");
        return dim1 * dim2 / 2;
    }
}

class ShowExample{
    public static void main(String[] args) {
        //creating objects from the class
        /*not allowed to create objects from abstract classes */
        // RealFigure ref = new RealFigure(); this is illegal
        FigRect obj = new FigRect(12.4, 23.5);

        FigTriangle obj1 = new FigTriangle(67.5, 9.99);

        /*however even for abstract classes, the superclass can be used as a reference for objects
         * for inheritance and runtime polymorphism
         */

         RealFigure figref;

         figref = obj;
         System.out.println("Area for rectangle " + figref.area());

         figref = obj1;
         System.out.println("Area of triangle " + figref.area());



    }
}

/*it is through superclass reference variables that overriden methods are gauged 
 * during runtime
 */