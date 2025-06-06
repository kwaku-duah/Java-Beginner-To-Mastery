package chapt09;

public class InterFaceRef {
    public static void main(String[] args) {
        /*creating an interface variable to access objects */
    IntStack mystack; //creating an interface reference variable

    DynamicStack dyn = new DynamicStack(10); //create objects of dynamic & implementstack(fixed stack)
    ImplementStack fxd = new ImplementStack(5);

    mystack  = dyn;
    for (int i = 0; i < 12; i++) mystack.push(i);

     mystack = fxd;
     for (int i=0; i<5; i++) mystack.push(i);

    mystack = dyn;
    System.out.println("values in dynamic stack");
    for (int i=0; i < 12; i++){
        System.out.println(mystack.pop());
    }

    mystack = fxd;
    System.out.println("Values in a fixed stack");
    for (int i=0; i<5; i++) System.out.println(mystack.pop());
    }

    /*dynamic method dispatch, at runtime mystack is called and it refers
     *  to type of object that invoked it, 
     */
}
