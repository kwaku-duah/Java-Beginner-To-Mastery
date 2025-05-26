package chapt08;

public class Figure {
    /*defining a figure to show method overriding and dynamic method dispatch */
    double dim1, dim2;

    Figure( int a, int b){
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("setting up a needed method by all classes and initializing to zero");
        return 0;
    }
}

class Rectangle extends Figure {

    Rectangle(int a, int b){
        super(a, b);
    }

    double area () {
        return dim1 * dim2;
    }
}

class Triangle extends Rectangle {

    Triangle(int a, int b){
        super(a, b);
    }

    double area() {
        return (dim1 *dim2)/2;
    }
}

class DemFiguring {
    public static void main(String[] args) {
        Figure f = new Figure(10, 220);
        Rectangle r = new Rectangle(21, 11);
        Triangle t = new Triangle(16, 13);

        //real objects made from the classes
        Figure figref;

        //superclass variable used as a reference for object r(rectangel)
        figref = r;
        System.out.println("area of rectangle " + figref.area());

        figref = t;
        System.out.println("area of triangle " + figref.area());

        figref = f;
        System.out.println("area of figure " + figref.area());
    }
}
