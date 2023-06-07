package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class AssignmentThree {
    public static void main(String[] args) {
        int id;
        String title;
        float price;
        String description;
        String category;

        Scanner inputID = new Scanner(System.in);

        System.out.println("Please enter your ID ");
        id = inputID.nextInt();

        Scanner InputTitle = new Scanner(System.in);
        System.out.println("Please enter your title");
        title = InputTitle.nextLine();

        Scanner getPrice = new Scanner(System.in);
        System.out.println("Please enter your price");
        price = getPrice.nextFloat();

        Scanner getDescription = new Scanner(System.in);
        System.out.println("Please enter your description");
        description = getDescription.nextLine();

        Scanner getCategory = new Scanner(System.in);
        System.out.println("Please enter your category");
        category = getCategory.nextLine();

        System.out.println("----------- Here is your result ----------");
        System.out.println("Your ID: " +id);
        System.out.println("Your title: "+title);
        System.out.println("Your price: "+price);
        System.out.println("Your description: "+description);
        System.out.println("Your category: "+category);
    }
}
