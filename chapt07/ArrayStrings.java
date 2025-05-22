package chapt07;

public class ArrayStrings {
    /*you can have arrays of Strings
     * just as you can have arrays of any type of objects
     */
    public static void main(String[] args) {
        String[] mystring = { "one", "two", "three"};

        for (int i=0; i< mystring.length; i++){
            System.out.println("[str " + i + "]:" + mystring[i]);
        }
    
}
}
