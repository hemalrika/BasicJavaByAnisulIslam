package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class AssignmentFourteen {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            System.out.print("Please Enter Starting Number : ");
            int m; // start number
            m = Input.nextInt();
            System.out.print("\nPlease enter Ending number : ");
            int n; // end number
            n = Input.nextInt();
            int temp, sum = 0, r;
            for (int i = m; i <= n; i++) {
                temp = i;
                while(temp != 0) {
                    r = temp%10;
                    sum = sum*10+r;
                    temp /= 10;
                }
                if(sum == i) {
                    System.out.printf("\n%d is pelidrom Number. Pelidrom is: %d", i, sum);
                } else {
                    System.out.printf("\n%d is not pelidrom number: changed number is: %d", i, sum);
                }
                sum = 0;
            }
        }
    }
}
