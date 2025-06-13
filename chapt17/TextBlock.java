package chapt17;

/*new addition to java is text blocks
 * of the form """ """" a sequence of characters that can occupy more
 * than three lines
 */

public class TextBlock {
    public static void main(String[] args) {
        String str = """
                text blocks makes new lines in java very easy!
                """;
            System.out.println(str);
    }
}
