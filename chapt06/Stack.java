package chapt06;

public class Stack {
    /*
     * stack operates on
     * first in, last out
     */
    // making a stack of top 10 integers
    int[] stck = new int[10];

    // declare top of stack (tos)
    int tos;

    // initialise
    Stack() {
        tos = -1;
    }

    /* uses two methods, push and pull */
    void push(int item) {
        if (tos == 9)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("it underflow");
            return 0;
        } else
            return stck[tos--];
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        int i;

        for (i = 0; i < 10; i++) {
            stack1.push(i);
            System.out.println("showing how stacking inside works for stack 1");
            System.out.println(i);
            System.out.println();
        }

        for (i = 10; i < 20; i++) {
            stack2.push(i);
            System.out.println("showin how stacking works for stack 2");
            System.out.println( i);
        }

        System.out.println("starting popping off stack 1");
        for (i = 0; i < 10; i++) System.out.println(stack1.pop());

        System.out.println("starting popping off stack 2");
        for (i = 10; i < 20; i ++) System.out.println(stack2.pop());

    }
}
