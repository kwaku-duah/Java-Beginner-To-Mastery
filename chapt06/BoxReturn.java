package chapt06;

public class BoxReturn {
    /*using parameters in methods
     * parameterized methods
     */

     //instance variables
    double depth;
    double height;
    double width;
  

    //method to calculate volume
    double volume() {
        return width * height * depth;
    }

    //method to set parameters
    void setDims(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public static void main(String[] args) {
        //create two objects
        BoxReturn box1 = new BoxReturn();
        BoxReturn box2 = new BoxReturn();
        double vol;

        //define arguments for box 1
       box1.setDims(20, 10, 3);

       vol = box1.volume();
       System.out.println("Volume for box1 " + vol);

        //define arguments for box 2
        box2.setDims(25, 10, 50);

        vol = box2.volume();
        System.out.println("Volume for box2 " + vol);
    }
}
