package chapt03;

public class OneDimensional {
    /* arrays in java require a two step process
     * first create a variable of desired type
     * secondly use the new keyword to allocate memory for the array
     * typically arrays take this form for 1Dimensional:
     * int[] numbers = new int[12] type[] variable name = new type[size]
     */
    public static void main(String[] args) {
        int[] months; //initialize the arr with the desired type

        int[] quarters = new int[3]; //arrays can be created and initialized instantly

        months = new int[12]; //allocation of memory space done for array and assigned to the set variable
        System.out.println("value for months is " + months); //print memory allocation

        /* arrays can be initialized directly , allocated memory right there
         * this is done with comma separated values placed in curly braces
         * 
         */
        int[] months_days = {31, 28, 31,30,31, 30,31,31,30,31,30,31};
        System.out.println("January has " + months_days[0] + " days");
        
        months[0] = 31;
        months[1] = 28;
        months[2] = 31;
        months[3] = 30;
        months[4] = 31;
        months[5] = 30;
        months[6] = 31;
        months[7] = 31;
        months[8] = 31;
        months[9] = 31;
        months[10] = 30;
        months[11] = 31;

        System.out.println("There are " + months[1] + " days in February ");

    }
}
