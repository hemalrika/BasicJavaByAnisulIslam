package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            System.out.print("Please enter a number for pattern : ");
            int number = Input.nextInt();
            for (int i = 1; i <= number; i++) {
                for(int j = 1; j <= i; j++ ) {
                    System.out.print(" "+ j + " ");
                }
                System.out.println();
            }
        }
    }
}
