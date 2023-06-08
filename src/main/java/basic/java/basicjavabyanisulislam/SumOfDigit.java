package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

/**
 * J kono kiso ke 10 diye vag kore number ta extract kore neya jay
 */
public class SumOfDigit {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            System.out.print("Please enter a number: ");
            int n;
            n = Input.nextInt();
            int temp, r, sum = 0;
            temp = n;
            while(temp > 0) {
                r = temp%10;
                sum += r;
                temp /= 10;
            }
            System.out.println("Total Value of sum is: "+sum);
        }
    }
}
