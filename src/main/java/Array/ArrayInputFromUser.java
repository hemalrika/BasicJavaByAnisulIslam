package Array;

import java.util.Scanner;

public class ArrayInputFromUser {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            System.out.print("Please enter 5 number : ");
            double[] number = new double[5];
            int sum = 0;
            for (int i=0; i < number.length; i++) {
                number[i] = Input.nextDouble();
                sum += number[i];
            }
            System.out.println("Total Number of array is : "+sum);
            double avg = sum / number.length;
            System.out.println("average is: "+avg);
        }
    }
}
