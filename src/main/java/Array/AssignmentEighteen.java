package Array;

import java.util.Scanner;

public class AssignmentEighteen {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            String[] weeks = {"Monday", "Twesday","Weednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            System.out.println("Please enter a number of day (1-7)");
            int day = Input.nextInt();
            System.out.println("Day Is : "+weeks[day-1]);
        }
    }
}
