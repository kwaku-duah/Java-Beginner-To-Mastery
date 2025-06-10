package chapt15;

//functional interface
interface MyNumber  {
    double getValue();
}

class TargetType {
public static void main(String[] args) {
    //Declare an interface reference
    MyNumber mynum;

    //a lambda expression is a constant expression
    /* when an interface reference(myNum) is assigned to a lambda expression
     * a class is constructed in which the interface method (getValue()) is implemented
     * 
     */
    mynum = () -> 123.5;

    //call get value
    System.out.println("A fixed value " + mynum.getValue());

    //a bit complex example
    mynum = () -> Math.random() * 100;

    //calling the lambda expression
    System.out.println("Random value " + mynum.getValue());
    System.out.println("Another random value " + mynum.getValue());

  
}
}