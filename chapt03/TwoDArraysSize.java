package chapt03;

public class TwoDArraysSize {
    /*
     * you must declare the size of the leftmost array(row), but not
     * necessarily the rightmost array(column)
     */
    public static void main(String[] args) {
        

        int[][] twoD = new int[4][]; // size of rightmost not populated
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        int i, j, k = 0; // initialize variables before you can use them

        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                twoD[i][j] = k;
                k++;
            }
        ;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i+1; j++)
            System.out.print(twoD[i][j] + " ");
            System.out.println();
            }
    }
}
