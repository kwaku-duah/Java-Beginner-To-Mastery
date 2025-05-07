package chapt03;

public class ThreeDArrays {
    /* Demonstration of a 3D array
     * type [][][]  variableName = new type[][][]
     * 
     */
    public static void main(String[] args) {
        int[][][] threeD = new int[3][4][5]; //initialize a 3D array

        int i,j,k; //declare variables

        for (i = 0; i < 3; i++) for (j = 0; j < 4; j++) for(k = 0; k < 5; k++){
            threeD[i][j][k] = i * j * k;
        };

        for (i = 0; i < 3; i++){
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++){
                    System.out.print(threeD[i][j][k] + " ");
                    
                }
                System.out.println();
                
            }
        }


    }
}
