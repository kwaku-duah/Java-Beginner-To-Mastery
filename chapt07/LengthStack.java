package chapt07;

public class LengthStack {
    /* are technically objects
     * and rebuilding stacks using length attribute
     */

     private int[] stck;
     private int tos;

     LengthStack(int size){
        stck = new int[size];
        tos = -1;
     }

     void push(int item){
        if (tos==stck.length-1) System.out.println("stack is full");
        else stck[++tos] = item;
     }

     int pop(){
        if (tos < 0) {
            System.out.println("understacked");
            return 0;
        } else {
            return stck[tos--];
        }
     }
     
}

class ObjArrays {
    public static void main(String[] args) {
       LengthStack obj = new LengthStack(5);
        LengthStack obj1 = new LengthStack(5);
        int i;

        for (i=0;i<10;i++) {
            obj.push(i);
            System.out.println(i);
        }

        for (i=10;i<20;i++){
            obj1.push(i);
            System.out.println(i);
        }

        for (i=0; i<5; i++){
            System.out.println(obj.pop());
        }

        for (i=0; i<5;i++){
            System.out.println(obj1.pop());
        }

    }
    
}
