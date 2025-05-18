package chapt07;

public class ConstructorExerciseDemo {
    /*
     * demonstrate all the flexible forms to get a constructor to operate
     * under most circumstances
     */

     //instance classes
    double width;
    double height;
    double depth;

    //multiple ways of parametrizing constructors to get the best out - three parameters
    ConstructorExerciseDemo(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //initializing it to empty, when no dimensions are specified
    ConstructorExerciseDemo() {
        width = -1; //negative one is used
        height = -1;
        depth = -1;
    }

    //instantiate it to a cube (all sides are equal)
    ConstructorExerciseDemo(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }

}


class ConstructorExerciseDemoExercise {
    public static void main(String[] args) {
        ConstructorExerciseDemo obj1 = new ConstructorExerciseDemo(25.9, 16.9, 17.7);
        ConstructorExerciseDemo obj2 = new ConstructorExerciseDemo();
        ConstructorExerciseDemo obj3 = new ConstructorExerciseDemo(30.78);

        //with three parameters
        System.out.println(obj1.volume());


        //with no parameters, initializing to zero
       System.out.println( obj2.volume());

        //all parameters equal, so initialize to cube
       System.out.println( obj3.volume());
    }
}
