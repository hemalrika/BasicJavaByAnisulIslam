package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

/**
 * Create a program to calculate installment amount per month
 */
public class AssignmentFour {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            int phonePrice = 1800;
            int numberOfInstallment, installmentPerMonth;
            Scanner Input = new Scanner(System.in);
            System.out.println("Please enter number of Installment ( in month )");
            numberOfInstallment = Input.nextInt();
            installmentPerMonth = phonePrice / numberOfInstallment;
            System.out.println("Your installment per month is: "+installmentPerMonth);
        }
    }
}
