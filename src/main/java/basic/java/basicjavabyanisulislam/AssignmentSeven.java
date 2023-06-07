package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class AssignmentSeven {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            char userInput;
            System.out.println("Do you love java? (y/Y/n/N)");
            userInput = Input.next().charAt(0);
            if(userInput == 'y' || userInput == 'Y') {
                System.out.println("you are java lover");
            } else {
                System.out.println("you are not java lover");
            }
        }
    }
}
