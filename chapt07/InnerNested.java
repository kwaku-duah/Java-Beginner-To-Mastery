package chapt07;

public class InnerNested {
    /*nested and inner classes in java
     * in java, there can be a class within another class
     * class could be static or non-static
     * once a class is enclosed within another class, it becomes
     * a member of that class and automatically has access to all
     * members of the class, including private
     * Note that, the enclosing class do not have access to 
     * members of the enclosed class
     * there are two types of nested classes: (static and non-static) and
     * inner classes
     * for a static class to access members of the enclosing class that are 
     * non-static, it must do through objects. static enclosed cannot access non
     * -static members of the parent class
     * 
     * demonstration of inner classes structure
     */

     int outer = 100;

     //inner class
     class Inner {
        void display() {
            System.out.println("value of outer, testing to see if it has access " + outer );
        }
     }

     void Test(){
        Inner inner = new Inner();
        inner.display();
     }

}

class TryingFirst {
    public static void main(String[] args) {
        InnerNested obj = new InnerNested();

        obj.Test();
    }
}
