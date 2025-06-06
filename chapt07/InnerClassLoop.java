package chapt07;

public class InnerClassLoop {
    /* inner classes can be defined within methods, for loops etc */

    int outer_x = 100;

    //method that takes a class, 
    void Test() {
        for (int i = 0; i < 10; i++){
            class Inner {

                void display(){
                    System.out.println("Demonstrating inner class in methods " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}

class InnerForTest{
    public static void main(String[] args) {
        InnerClassLoop obj = new InnerClassLoop();

        obj.Test();
    }
}
