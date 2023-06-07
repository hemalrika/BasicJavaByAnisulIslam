package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class getInputFromUser {
    public static void main(String[] args) {
        /*
        * Get number as input
        * */
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter any number");
        number = input.nextInt();
        System.out.println("Your entered number is: "+number);
    }
}
