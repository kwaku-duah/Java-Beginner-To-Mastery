package chapt09;

public class DynamicStack implements IntStack {
    //using the same interface to implement a dynamic stack
    private int[] stck;
    private int tos;

    DynamicStack(int size){
        stck = new int[size];
        tos = -1;
    }

    public void push(int item){
        if (tos == stck.length-1) {
            int[] temp = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;

        } else stck[++tos] = item;
    }

    public int pop(){
        if (tos < 0) {
            System.out.println("it is understacked");
            return 0;
        } else return stck[tos--];

    }
    
}

class Works {
    public static void main(String[] args) {
        DynamicStack mystack = new  DynamicStack(7);
        int i;
        
        for (i = 0; i < 13; i ++) {
            mystack.push(i);
            System.out.println(i);
        }

        for (i = 0; i < 10; i++){
            System.out.println(mystack.pop());
        }
        
    }
}
