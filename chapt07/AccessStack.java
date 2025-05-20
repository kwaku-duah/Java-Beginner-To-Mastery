package chapt07;

public class AccessStack {
    /*building a protected stack */
    private int[] stck = new int[10];
    private int tos;


    AccessStack() {
        tos = -1;
    }

    void push(int item){
        if (tos==9) System.out.println("Stack is full");
        else stck[++tos] = item;
    }

    int pop(){
        if( tos < 0) {System.out.println("stack underflow");
        return 0;}
        else return stck[tos--];
    }
}

class SeeWork {
  public static void main(String[] args) {
    AccessStack obj1 = new AccessStack();
    AccessStack obj2 = new AccessStack();
    int i;

    for (i=0; i< 10; i++) {
        obj1.push(i);
    System.out.println("values for stack 1 " + i);
    }

    for (i = 10; i<20; i++) {
        obj2.push(i);
        System.out.println(i);
    }

    // popping it to see
    for(i = 0;i<10;i++) {
        System.out.println(obj1.pop());
    }

    // popping stack 2
    for(i=10; i<20;i++){
        System.out.println(obj2.pop());
    }

    /*these statements are illegal */
    // obj1.tos;
    // obj2.stck[2] = 100;


  }
}