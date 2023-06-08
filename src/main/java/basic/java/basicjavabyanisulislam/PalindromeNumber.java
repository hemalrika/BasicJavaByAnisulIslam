package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            System.out.print("Please enter a number: ");
            int n;
            n = Input.nextInt();
            int temp, r, sum = 0;
            temp = n;
            while(temp > 0) {
                r = temp%10;
                sum = sum*10+r;
                temp /= 10;
            }
            if(n == sum) {
                System.out.println("Palindrome Number");
            } else {
                System.out.println("Not a palidrome Number");
            }

        }
    }
}
