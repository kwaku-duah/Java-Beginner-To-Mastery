package chapt07;

public class AccessModifiers {
    /*access modifiers in java are basically public, private and
    protected which is only used during inheritance
     * public means that the member(code or data) is accessible to all codes
     * in the program(that same class, other classes, and even other packages
     * through importation)
     * private means the members are only accessible to other members of that 
     * same class
     * NB: there is a scenario where no access modifier is used, java defaults
     * to making those members public WITHIN ITS PACKAGE
     * package refers to a group of classes
     */

     int a; //default access (so it is public within this package)
     public int b; //public means accessible to all members whether in or external
     private int c; //only accessible within this CLASS

     //method to access c
     void setc(int i){
        c = i;
     }

     //get value of c
     int getc(){
        return c;
     }
}

class TrialTest {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        /*this is another class, though same package, 
         * trying to set values for the instance variables in the AccessModifiers Class
         * 
         */

         //a is package-private so can be done
        obj.a = 10;
        //b is public so accessible to all
        obj.b = 20;
        
        /*error for trying to set c 
        obj.c = 29; c is not visible
         * so c, instance variable can only be set through the defined method
         * and its value can also be only gotten through the defined method
         */

         //c has been set
         obj.setc(23);

         //accessing the value of c
         obj.getc();
         System.out.println("values for a,bc are: " + obj.a + " " + obj.b + " " + obj.getc());
        
    }
}