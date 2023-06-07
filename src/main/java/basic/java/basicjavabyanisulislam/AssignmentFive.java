package basic.java.basicjavabyanisulislam;
import java.util.Scanner;
public class AssignmentFive {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int age;
        System.out.println("Please enter your age");
        age = Input.nextInt();
        if(age >= 18) {
            System.out.println("Valid votar");
        } else {
            System.out.println("Invalit voter");
        }
    }
}
