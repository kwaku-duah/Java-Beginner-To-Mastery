package chapt03;

public class ProjectExample {
    /* Build a multiplication for 5x5 matrix */
    public static void main(String[] args) {

        int[][] five = new int[5][5];
        
        int i,j;


        for (i = 0; i < 5; i++) for(j = 0; j < 5; j++) {
            five[i][j] = (i+1) * (j+1);
        };


        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++)
            System.out.print(five[i][j] + " ");
            System.out.println();
        };
        
        
    }
}
