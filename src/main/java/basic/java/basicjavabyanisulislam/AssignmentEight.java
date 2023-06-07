package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class AssignmentEight {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            System.out.println("have you completed masters ?(y/n)");
            char Status, Fluency;
            Status = Input.next().charAt(0);
            System.out.println("Are you fluent in english?(y/n)");
            Fluency = Input.next().charAt(0);
            if(Status == 'y' && Fluency == 'y') {
                System.out.println("you are eligible to for the job interview");
            } else {
                System.out.println("Sorry. you are not eligible to for the job interview+");
            }
        }
    }
}
