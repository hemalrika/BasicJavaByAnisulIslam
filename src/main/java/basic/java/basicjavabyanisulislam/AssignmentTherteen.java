package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class AssignmentTherteen {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            System.out.print("Please enter n times of number: ");
            System.out.println();
            int n,fibonacchi = 0, first=0, second=1;
            n = Input.nextInt();
            System.out.print(first+" "+second);
            for (int i=3;i<=n; i++) {
                fibonacchi = first+second;
                System.out.print(" "+fibonacchi+" ");
                first = second;
                second = fibonacchi;
            }
            System.out.println("\nlast fibonacchi number is: "+fibonacchi);
        }
    }
}
