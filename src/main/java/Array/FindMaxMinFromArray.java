package Array;

import java.util.Scanner;

public class FindMaxMinFromArray {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            int[] numbers = new int[5];
            System.out.print("Please enter 5 number : ");
            int maxNum;
            int minNum;
            for (int i=0; i<numbers.length; i++) {
                numbers[i] = Input.nextInt();
            }
            maxNum = numbers[0];
            minNum = numbers[0];
            for (int i=0; i < numbers.length; i++) {
                if(maxNum < numbers[i]) {
                    maxNum = numbers[i];
                }
                if(minNum > numbers[i]) {
                    minNum = numbers[i];
                }
            }
            System.out.println("Max number is: "+maxNum);
            System.out.println("Min number is: "+minNum);
        }
    }
}
