package chapt05;

public class IFElseIfStatements {
    /* demonstrate the if-else-if ladder in java */
    public static void main(String[] args) {
        int month = 4; //April
        String season;
    
        if (month == 12 || month == 1 || month == 2)
            season = "Winter";
        else if ( month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if ( month == 6 || month == 7 || month == 8)
            season = "Summer";
        else if ( month == 6 || month == 8 || month == 9)
            season = "Autumn";
        else
            season = "Bogus Season";

        System.out.println("April with number " + month + " falls within " + season);
        
    }
}
