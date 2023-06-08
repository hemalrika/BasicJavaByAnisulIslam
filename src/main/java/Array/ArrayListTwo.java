package Array;

import java.util.ArrayList;

public class ArrayListTwo {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        // add number 1 values
        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);

        // add number 2 values
        number2.add(11);
        number2.add(22);
        number2.add(33);
        number2.add(44);

        // insert all number1 value to number3
        number3.addAll(number1);
        System.out.println("number 1 is: "+number1);
        System.out.println("Number 2 is: "+number2);
        System.out.println("Number 3 is: "+number3);
        boolean isNumberEqual = number1.equals(number3);
        System.out.println("Number1 is equal number3 : "+isNumberEqual);
    }
}
