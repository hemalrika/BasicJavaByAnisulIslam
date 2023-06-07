package basic.java.basicjavabyanisulislam;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            int num;
            boolean isPrime = true;
            System.out.print("Enter any positive integer: ");
            num = Input.nextInt();
            if(num < 0) {
                System.out.println("Sorry! You've entered negative value");
            } else {
                for (int i = 2; i < num; i++) {
                    if(num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
                    System.out.println("Its prime number");
                } else {
                    System.out.println("its not prime number");
                }
            }
        }
    }
}
