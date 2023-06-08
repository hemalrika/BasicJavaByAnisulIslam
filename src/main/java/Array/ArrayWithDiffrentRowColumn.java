package Array;

public class ArrayWithDiffrentRowColumn {
    public static void main(String[] args) {
        int[][] numbers = new int[4][];
        numbers[0] = new int[1];
        numbers[1] = new int[2];
        numbers[2] = new int[3];
        numbers[3] = new int[4];
        int k = 0;
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < row+1; column++) {
                numbers[row][column] = k;
                k++;
            }
        }
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < row+1; column++) {
                System.out.print(" "+numbers[row][column]+" ");
            }
            System.out.println();
        }
    }
}
