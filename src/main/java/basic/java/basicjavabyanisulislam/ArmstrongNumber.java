package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            System.out.print("Please enter a number : ");
            int n = Input.nextInt();
            int sum = 0, r, temp;
            temp = n;
            while(temp > 0) {
                r = temp%10;
                sum += Math.pow(r, 3);
                temp = temp/10;
            }
            if(sum == n) {
                System.out.println("Its ArmStrong Number");
            } else {
                System.out.println("Its not armstrong number");
            }
        }
    }
}
