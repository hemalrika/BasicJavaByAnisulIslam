package Array;

public class FindArrayOutput {
    public static void main(String[] args) {
        int[][] numberValue = new int[4][5];
        int number = 0;
        for (int row = 0; row < 4; row++) {
            for(int column = 0; column < 5; column++) {
                System.out.print(" "+ number + " ");
                number += 1;
            }
            System.out.println();
        }
    }
}
