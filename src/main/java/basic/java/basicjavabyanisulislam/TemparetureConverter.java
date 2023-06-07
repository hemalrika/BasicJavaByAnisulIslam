package basic.java.basicjavabyanisulislam;
import java.util.Scanner;
public class TemparetureConverter {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double Farenheight, Celcious;
        System.out.print("Please enter Farenheight");
        Farenheight = Input.nextDouble();
        Celcious = 0.5 * ( Farenheight - 32 );
        System.out.println("Celcious is: "+ Celcious);
    }
}
