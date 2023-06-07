package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class AssignmentEleven {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            System.out.println("Please enter a number for factorial");
            int n, factorialResult = 1;
            n = Input.nextInt();
            for(int i=1; i<=n; i++) {
                factorialResult = factorialResult * i;
                System.out.println(factorialResult);
            }
            System.out.printf("Factorial of %d is %d", n, factorialResult);
        }
    }
}
