package chapt06;

public class BoxExample {
    /*methods in java are powerful and flexible
     * format of methods - 
     * type name(parameter-list) {
     * body of the method}
     * where type specifies the type of data the method returns
     * if the method would not return anything, type is specified to be void
     * name is the identifier, parameter-list takes type variable pairs separated
     * by commas
     * 
     */
//instance variables
double width;
double height;
double length;

void volume() {
    System.out.println("Volume is ");
    System.out.println(width * height * length);
}

public static void main(String[] args) {
    BoxExample box1 = new BoxExample();
    BoxExample box2 = new BoxExample();

    //assign values to box1
    box1.height = 30;
    box1.length  = 10;
    box1.width = 5;

    //assign values to box2
    box2.height = 5;
    box2.length = 10;
    box2.width = 3;

    //use method on box1 to printout the volume
    System.out.println("Volume for box1 ");
    box1.volume();

    //use method on box2 to printout the volume
    System.out.println("volume for box2");
    box2.volume();
}

    
}
