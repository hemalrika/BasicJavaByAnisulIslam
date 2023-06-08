package Array;

import java.util.Scanner;

public class DiagonalMatrics {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            int[][] A = new int[3][3];
            int[][] B = new int[3][3];
            int sumOfDiagnalElement = 0, sumOfUpperElement = 0, sumOfLowerElement = 0;
            // get A value
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 3; column++) {
                    System.out.printf("A[%d][%d]", row, column);
                    A[row][column] = Input.nextInt();
                }
            }
            // get B value
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 3; column++) {
                    System.out.printf("B[%d][%d]", row, column);
                    B[row][column] = Input.nextInt();
                }
            }
            // Show A Value
            System.out.println("A = ");
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 3; column++) {
                    System.out.print(" "+ A[row][column] + " ");
                }
                System.out.println();
            }
            System.out.println();
            // Show B Value
            System.out.println("B = ");
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 3; column++) {
                    System.out.print(" "+ B[row][column] + " ");
                }
                System.out.println();
            }
            System.out.println();
            // sum of diagnal element
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 3; column++) {
                    if( row == column ) {
                        sumOfDiagnalElement = sumOfDiagnalElement + A[row][column] + B[row][column];
                    }
                    if( row < column ) {
                        sumOfUpperElement = sumOfUpperElement + A[row][column] + B[row][column];
                    }
                    if( row > column ) {
                        sumOfLowerElement = sumOfLowerElement + A[row][column] + B[row][column];
                    }
                }
            }
            System.out.println("Sum Of Diganal Element is : "+sumOfDiagnalElement);
            System.out.println("Sum Of upper Element is : "+sumOfUpperElement);
            System.out.println("Sum Of lower Element is : "+sumOfLowerElement);
        }
    }
}
