package src;


//Method that returns value of a given number by multiplying by two
public class DoubleIt{
    
    public int doubleValue(int val){
        return val * 2;
    }
    public static void main(String[] args) {
       DoubleIt obj = new DoubleIt();

       System.out.println(obj.doubleValue(20));;
   
    }
}
