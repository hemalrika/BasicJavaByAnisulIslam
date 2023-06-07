package basic.java.basicjavabyanisulislam;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double width, height, area;
        System.out.println("Please enter width: ");
        width = Input.nextDouble();
        System.out.println("Please enter height");
        height = Input.nextDouble();
        area = 0.5*width*height;
        System.out.printf("Triangle Area Is: %.3f", area);

    }
}
