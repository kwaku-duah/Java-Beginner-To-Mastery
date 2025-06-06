package chapt04;

public class IncrementDecrementExample {
    /*Depicting javas increment and decrease special operator
     * it increases value for a variable by one or decreases by 1
     * it has a postfix and prefix ability
     * prefix ++variable, adds 1 before reaching the value of the assigned variable
     * postfix variable++, adds 1 to the value obtained from the variable 
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c, d;

        c = ++b;
        d = a++;
        c++;
        System.out.println( "prefix operation = " + c);
        System.out.println("postfix = " +  d);
        System.out.println(c);
    }
}
