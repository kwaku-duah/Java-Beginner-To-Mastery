package chapt07;

public class StringDemo {
    /*Demonstrating strings in java
     * String is a class in java
     * so to create any string, you gotta make an instance of that class
     * which becomes a real object
     */
    public static void main(String[] args) {
        String obj = "Java is the best";
        String obj1 = " the greatest programming language ever";
        String obj3 = obj + " and " + obj1;
        System.out.println(obj3);
    }
}
