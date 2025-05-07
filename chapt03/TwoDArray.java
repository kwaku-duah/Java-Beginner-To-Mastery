package chapt03;

public class TwoDArray {
    /* Demonstration of a 2 dimensional array in Java */
    public static void main(String[] args) {
        //build a 4x5 2d array, 4 rows by 5 columns

        int i, j, k = 0; //initialize starters for rows and columns

        int[][] twoD = new int[4][5];
        
        for (i = 0; i < 4; i++) for (j = 0; j < 5; j++) {
            twoD[i][j] = k;
            k++;
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) System.out.print( "(" + i + "," + j + ")=" + twoD[i][j] + " ");
            System.out.println();

            
        }

      
        
        
    }
}
