package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(-8);
        numbers.add(30);
        numbers.add(23);
        numbers.add(65);
        // sort arraylist using collection.sort
        //Collections.sort(numbers);
        //System.out.println("After sort Now Number Is : "+numbers);
        // sort reverce
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
    }
}
