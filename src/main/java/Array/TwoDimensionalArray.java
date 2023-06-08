package Array;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            int[][] numbers = new int[2][3]; // row = 2 & column = 3
            System.out.println("Please enter row and column ( 2x3 )");
            for (int row = 0; row < 2; row++) {
                for (int column = 0; column < 3; column++) {
                    numbers[row][column] = Input.nextInt();
                }
            }

            for (int row = 0; row < 2; row++) {
                for (int column = 0; column < 3; column++) {
                    System.out.print(" "+numbers[row][column]+ " ");
                }
                System.out.println();
            }
        }
    }
}
