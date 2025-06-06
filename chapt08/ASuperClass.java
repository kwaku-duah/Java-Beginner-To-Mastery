package chapt08;

public class ASuperClass {
    /*
     * inheritance remains a cornerstone in java programming language
     * a general class is defined and then subclasses are defined that 
     * inherits all attributes of the general class and adds its own unique 
     * properties.
     * The general class is called  superclass and the inheriting class is
     * subclasss
     */
    int i, j;

    void showij(){
        System.out.println("i and j: " + i + " " + j);
    }
}

/*structure of inheritance in 
 * java
 * takes class name/identifier-of-subclass EXTENDS (keyword that gives
 * attributes) then name/Identifier of the particular general class or 
 * super class
 */

 class ASubClass extends ASuperClass{
    int k;

    void showk(){
        System.out.println("value for k " + k);
    }

    int sum() {
        return i+j+k;
    }
 }

 class SimpleInheritance{
    public static void main(String[] args) {

        //instantiated superclass and subclass
        var superaObj = new ASuperClass();
        
        //subclass
        var suberaObj = new ASubClass();

        //superclass has access to its properties
        superaObj.i = 10;
        superaObj.j = 20;

        //superclass using its own members
        superaObj.showij();

        //subclass has access to public members of a class
        suberaObj.i = 7;
        suberaObj.j = 13;
        //and its own unique members as a subclass
        suberaObj.k = 89;

        //subclass having access to methods in superclass
        suberaObj.showij();

        //subclass have access to its own members too
        suberaObj.showk();

        System.out.println(suberaObj.sum());


    }
 }
