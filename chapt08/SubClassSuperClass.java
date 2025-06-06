package chapt08;

public class SubClassSuperClass {
    // further use of super keyword to initialise all constructors here in a
    // subclass
    double width, depth, height;

    // constructor to clone an object
    SubClassSuperClass(SubClassSuperClass obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    // constructor to Test with full given dimensions
    SubClassSuperClass(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    // constructor to initialise an empty box
    SubClassSuperClass() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor to Test a cube
    SubClassSuperClass(double len) {
        width = depth = height = len;
    }

    double volume() {
        return width * height * depth;
    }

}


// creating a subclass
class WeightBox extends SubClassSuperClass {
    // adds its own unique property / variable
    double weight;

    // its own constructor
    WeightBox(double w, double d, double h, double m) {
        // use super to Test , streamlines code

        // there has been constructor overloading, the compiler will pickup the one with
        // matching arguments
        super(w, d, h);

        // initialise its own unique attribute
        weight = m;
    }

    // initialise all the other constructors
    // cube
    WeightBox(double len, double m) {
        super(len);
        weight = m;
    }

    // initialise empty box
    WeightBox() {
        super();
        weight = -1;
    }

    // clone of an object
    WeightBox(WeightBox ob, double m) {
        super(ob);
        weight = m;
    }

}

// Creating another subclass
class Shipping extends WeightBox {
    /*this is expected to have traits of WeightBox and SubClassSuperClass(Shipping)
     * 
     */
    double costs;
    

  //cube 
  Shipping(double len, double c){
    width = height = depth = len;
    costs = c;
  }

  //all dimensions given
  Shipping(double w, double h, double d, double m, double c){
    super(w, d, h, m);
    costs = c;
  }

  //when when initializing to empty
  Shipping(){
    super();
    costs = -1;
  }

  //object cloning
  Shipping(Shipping ob, double m, double c){
    super(ob, m);
    costs = c;
  }

 double volume() {
    return width * height * depth;
  }

}

class WorkTest{
    public static void main(String[] args) {
        var obj = new Shipping();
        var obj1 = new Shipping(20.3, 56.34);
        var obj2 = new Shipping(obj1, 42.5, 41.8);

        System.out.println(obj.volume() + " " + obj.weight + " ₵" + obj.costs);
        System.out.println(obj1.volume() + " ₵" + obj1.costs);
        System.out.println(obj2.volume() + " ₵" + obj2.costs);
    }
}

