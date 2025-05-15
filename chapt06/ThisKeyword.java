package chapt06;

public class ThisKeyword {
    /*the use of the this keyword
     * this helps an object reference the value of its current property 
     * and then take in a new value to replace it
     */
    //all objects have these attributes
    double width;
    double height;
    double depth;

    //temporary variables available only to this method
    ThisKeyword(double width, double height, double depth){
        //using w, h, d in order to avoid variable shadowing
        //every object should have a reference to its value for an instance variable

        //left hand side refers to the object invoking it with the instance variable
        //right hand side is value of the temporary variable available to the method to replace the default value
        this.width = width;
        this. height = height;
        this.depth = depth;
    }
}
