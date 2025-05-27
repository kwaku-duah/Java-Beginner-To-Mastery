package chapt08;

public class InferType {
    /*local variable type inference under inheritance */

}

class First extends InferType{
    //body
    int x;
}

class Second extends First {
    int y;
}


class ExampleInferType {

    //gives an object that returns an object of type Inftertype
    static InferType getObj(int which){
        switch(which) {
            case 0: return new InferType();
            case 1: return new First();
            default: return new Second();
        }
    }

    public static void main(String[] args) {
        /* the method getObj returns different type of objects within the Infertype
        inheritance hierarchy, but its specificied return type is Infertype
        in this case the types of variables are inferred to be Infertype even though
        different derivatives of the objects are obtained
         */

         //here the infertype refers to object of type Infertype(superclass)
        var inferobj = getObj(0);

        var secobj = getObj(1);

        var thirdobj = getObj(2);

        // thirdobj.y = 13; does not see its own field
        
        /*because return type of secobj and thirdobj is of type InferType
         * it cannot even access the second and third classes fields
         */
    }
}