package chapt07;

public class MethodsString {
    /*some methods in the class String includes:
     * equals(), length() and charAt()
     * 
     */
    public static void main(String[] args) {
        String myString1 = "First String";
        String myString2 = "Second String";
        String myString3 = myString1;

        System.out.println("the length of string 1 is " + myString1.length());

        System.out.println("the index of a charAt(specified argument) "+ myString2.charAt(4));

        //test for equals to
        if(myString1.equals(myString2)) {
              System.out.println("myString1 i== myString2");
            return;
        } else System.out.println("myString1 != myString2");

        while( myString1.equals(myString3)) {
            System.out.println("they are equal");
            break;
            
        }
    }
}
