package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class AssignmentSixteen {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            String username = "anis";
            String password = "123456";
            String UserInputUsername = "";
            String UserInputPassword = "";
            do {
                System.out.print("Please enter username : ");
                UserInputUsername = Input.nextLine();
                System.out.print("\nPlease enter password : ");
                UserInputPassword = Input.nextLine();
                if( username.equals(UserInputUsername) && password.equals(UserInputPassword) ) {
                    System.out.println("Welcome to the system");
                    return;
                } else {
                    System.out.println("User/Password is incorrect. Please try again letter");
                }
            } while( !username.equals(UserInputUsername) && !password.equals(UserInputPassword)  );
        }
    }
}
