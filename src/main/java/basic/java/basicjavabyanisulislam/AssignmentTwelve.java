package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class AssignmentTwelve {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            int sum = 0, m, n; // m for maximum and n for minimum
            System.out.println("Please enter Minimum number");
            n = Input.nextInt();
            System.out.println("Please enter Maximum Number");
            m = Input.nextInt();

            for( int i=n; i<= m; i++) {
                if(i % 2 == 0) {
                    continue;
                } else {
                    System.out.println(i);
                }
            }
            System.out.printf("Sum From %d to %d is : %d", n, m, sum);
        }

    }
}
