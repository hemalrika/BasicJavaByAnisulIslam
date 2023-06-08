package Array;

import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            int[][] A = new int[2][3];
            int[][] B = new int[2][3];
            int[][] sum = new int[2][3];

            for(int row = 0; row < 2; row++){
                for(int column = 0; column < 3; column++) {
                    System.out.printf("A[%d][%d]", row, column);
                    A[row][column] = Input.nextInt();
                }
            }
            System.out.println();
            for(int row = 0; row < 2; row++){
                for(int column = 0; column < 3; column++) {
                    System.out.printf("B[%d][%d]", row, column);
                    B[row][column] = Input.nextInt();
                }
            }
            System.out.println("A = ");
            for(int row = 0; row < 2; row++){
                for(int column = 0; column < 3; column++) {
                    System.out.print(" "+A[row][column]+" ");
                }
                System.out.println();
            }
            System.out.println("B = ");
            for(int row = 0; row < 2; row++){
                for(int column = 0; column < 3; column++) {
                    System.out.print(" "+B[row][column]+" ");
                }
                System.out.println();
            }
            System.out.println("Sum is : ");
            for(int row = 0; row < 2; row++){
                for(int column = 0; column < 3; column++) {
                    sum[row][column] = A[row][column] + B[row][column];
                    System.out.print(" "+ sum[row][column] + " ");
                }
                System.out.println();
            }
        }
    }
}
