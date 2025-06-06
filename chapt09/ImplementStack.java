package chapt09;

public class ImplementStack implements IntStack {

    private int[] stck;
    private int tos;

    //allocate and initialize the stack
    ImplementStack(int size){
        stck = new int[size];
        tos = -1;
    }

    //implement the methods
    public void push(int item){
        if (tos == stck.length -1) System.out.println("The stack is full");
        else stck[++tos] = item;
    }


    public int pop() {
        if(tos < 0) {
            System.out.println("undertacked");
            return 0;
        }
        else return stck[tos--]; 
    }
}


class IFTest {
    public static void main(String[] args) {
        ImplementStack mystack1 = new ImplementStack(10);
        ImplementStack mystack2 = new ImplementStack(15);
        int i;

        for (i = 0; i < 10; i++) {
            System.out.println("Pushing onto the stack1");
            mystack1.push(i);
            System.out.println("values been pushed " + i);
        }

        for (i = 0; i < 10; i++){
            System.out.println("Removing from stack1");
            System.out.print(mystack1.pop() + " ");
        }

          for (i = 10; i < 25; i++) {
            System.out.println("Pushing onto the stack2");
            mystack2.push(i);
            System.out.println("values been pushed " + i);
        }

        for (i = 0; i < 15; i++){
            System.out.println("Removing from stack2");
            System.out.print(mystack2.pop() + " ");
        }
        
    }
}