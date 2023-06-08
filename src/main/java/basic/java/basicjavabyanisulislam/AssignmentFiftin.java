package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class AssignmentFiftin {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            System.out.print("Please enter start number : ");
            int n = Input.nextInt(); // start
            System.out.print("\nPlease enter last number : ");
            int m = Input.nextInt();
            int temp, r, sum=0;
            for (int i = n; i <= m; i++) {
                temp = i;
                while(temp > 0) {
                    r = temp%10;
                    sum += Math.pow(r, 3);
                    temp = temp/10;
                }
                if(sum == i) {
                    System.out.println(i + " is ArmStrong Number : " + sum);
                } else {
                    System.out.println(i+ " is not armstrong number : "+sum);
                }
                sum = 0;
            }
        }
    }
}
