package chapt17;

/*use switch expression to identify english alphabets that are consonants or vowels */
public class Vowel {

    public static void main(String[] args) {
        // if Y is to be counted vowel, set this variable to true
    boolean isYvowel = true;

    char ch = 'Y';

    boolean isVowel = switch(ch) {
        case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
        case 'y', 'Y' ->  {if(isYvowel) yield true; else yield false;}
        default -> false;
    };
    
    if(isVowel) System.out.println("it y is a vowel " + isVowel);
    }
}
