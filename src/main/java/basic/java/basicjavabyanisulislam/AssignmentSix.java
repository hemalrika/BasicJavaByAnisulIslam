package basic.java.basicjavabyanisulislam;
import java.util.Scanner;
public class AssignmentSix {
    public static void main(String[] args) {
        int digit;
        Scanner Input = new Scanner(System.in);
        System.out.print("Please Enter a digit(1-9): ");
        digit = Input.nextInt();
        if(digit > 9 || digit < 0) {
            System.out.println("Invalid digit\n");
        } else {
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }
}
