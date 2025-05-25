package chapt08;

public class KeyWordSuper {
    /*subclass constructors access members of the super class especially
     * instance variable in its constructors, this is inefficient and redundant
     * even some members of the superclass which are private are always  
     * inaccessible to the subclass -
     *  SOLUTION to this is through the use of the SUPER KEYWORD 
     * it has two general forms: firstly a call to super calls the constructor
     * of the superclass and then secondly it can be used to access a member 
     * of a superclass which has been hidden by a member of a subclass
     */

     double width, height, depth;

     //constructor when full dimensions are given
     KeyWordSuper(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
     }

      //constructor to initialise an empty or  unuseable box
    KeyWordSuper(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //constructor to initialise a cube
    KeyWordSuper(double len) {
        width = height = depth = len;
    }

    //constructor for an object to clone itself
    KeyWordSuper(KeyWordSuper obj){
        width = obj.width;
        depth = obj.depth;
        height = obj.height;
    }

}

class BoxWeight extends KeyWordSuper{
    //adding its own unique variable
    double weight;

    BoxWeight(double w, double d, double h, double m){
        /* it is expected  to initialise these variables like
         * width = w; height = h , depth = d, weight = m
         * but super shortens that
         */
        super(w, d, h);
        
        //initialise only the variable specific to this
        weight = m;
    }
}
