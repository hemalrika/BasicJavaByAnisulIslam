package basic.java.basicjavabyanisulislam;

public class MathDemo {
    public static void main(String[] args) {
        int x = 20;
        int y = 30;
        System.out.println("Max number is: "+ Math.max(x, y));
        System.out.println("Min number is: "+ Math.min(x, y));
        int absolute = Math.abs(y);
        System.out.println("Absolute value of y is: "+absolute);
        double power;
        power = Math.pow(x, 2);
        System.out.println("Power of x is: "+power);
        long roundVal = Math.round(30.44);
        System.out.println("Round of 30.44 is: "+roundVal);
        System.out.println("value of PI is: "+Math.PI);
    }
}
