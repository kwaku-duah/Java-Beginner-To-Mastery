package chapt09;

public class StackWithInterface implements PrivateMethodInterface{
    private int[] stck;
    private int tos;

    StackWithInterface(int size) {
        stck = new int[size];
        tos = -1;
    }
    //implementing the push method
    public void push(int item){
        if (tos == stck.length-1) System.out.println("Stack is full");
        else stck[++tos] = item;
    }

    public int pop(){
        if ( tos < 0) {
            System.out.println("It is understacked");
            return 0;
       
        } else return stck[tos--];
    }

    public static void main(String[] args) {
        PrivateMethodInterface obj = new StackWithInterface(60);

        for (int i = 0; i< 60; i++) {
            obj.push(i);
            System.out.println(i);
        }

        int[] popped = obj.popNElements(3);
        System.out.println();
        for (int pop: popped) System.out.println(pop);

        int[] skippop = obj.skipAndPopNElements(2, 10);
        System.out.println("skip and pop");
        for (int skippy: skippop) System.out.println(skippy);
        
      

    
        

    }
}
