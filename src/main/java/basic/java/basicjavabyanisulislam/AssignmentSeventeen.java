package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class AssignmentSeventeen {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            System.out.println("Please enter a number : ");
            int inputNumber = Input.nextInt();
            for(int i = 1; i <= inputNumber; i++ ) {
                int binaryNumber = 1;
                for (int j = 1; j <= i; j++) {
                    System.out.print(" "+binaryNumber+ " ");
                    switch (binaryNumber) {
                        case 0:
                            binaryNumber = 1;
                            break;
                        case 1:
                            binaryNumber = 0;
                            break;
                    }
                }
                System.out.println();
            }
        }
    }
}
