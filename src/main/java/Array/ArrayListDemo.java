package Array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(2, 5);
        //System.out.println(numbers);
        /*for(int x: numbers) {
            System.out.println("Value is : "+x);
        }*/
        Iterator itr = numbers.iterator();

        while(itr.hasNext()) {
            System.out.println("Number is: "+itr.next());
        }

//        numbers.remove(0);
        System.out.println("Now size of number is: "+ numbers.size());
        //numbers.removeAll(numbers);
        //System.out.println("After remove: "+numbers);
//        numbers.clear();
        boolean isArrayListEmpty = numbers.isEmpty();
        System.out.println("ArrayList is empty : "+isArrayListEmpty);
        boolean containsNumber = numbers.contains(4);
        if(containsNumber) {
            System.out.println("It contains number 4");
        } else {
            System.out.println("It not contains number 4");
        }
        // find index
        int indexOfNumber = numbers.indexOf(4);
        System.out.println("Index of number is: "+indexOfNumber);
        numbers.set(2, 50); // replace
        System.out.println("after replace number now its : "+numbers);
        // get value from specific position
        int secondPositionNumber = numbers.get(2);
        System.out.println("position of 2 number is: "+secondPositionNumber );
    }
}
