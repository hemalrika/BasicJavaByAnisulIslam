package basic.java.basicjavabyanisulislam;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        //Random rand = new Random();
        //int randomNumber = rand.nextInt(10)+10;
        int randomNumber = (int) (Math.random()*10) + 1;
        System.out.println(randomNumber);
    }

}
