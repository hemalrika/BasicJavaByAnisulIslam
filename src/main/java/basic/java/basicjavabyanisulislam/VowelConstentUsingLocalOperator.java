package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class VowelConstentUsingLocalOperator {
    public static void main(String[] args) {
        try(Scanner Input = new Scanner(System.in)) {
            System.out.println("Please Enter A Letter");
            char ch = Input.next().charAt(0);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }
    }
}
