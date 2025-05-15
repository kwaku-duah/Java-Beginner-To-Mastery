package chapt06;

public class ThisKeyword {
    /*the use of the this keyword
     * this helps an object reference the value of its current property 
     * and then take in a new value to replace it
     */
    double width;
    double height;
    double depth;

    ThisKeyword(double w, double h, double d){
        //using w, h, d in order to avoid variable shadowing
        //every object should have a reference to its value for an instance variable

        this.width = w;
        this. height = h;
        this.depth = d;
    }
}
