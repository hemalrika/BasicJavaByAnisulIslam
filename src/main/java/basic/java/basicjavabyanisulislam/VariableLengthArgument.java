package basic.java.basicjavabyanisulislam;

public class VariableLengthArgument {
    void add(int ...numbers) {
        int sum = 0;
        for (int x: numbers) {
            sum += x;
        }
        System.out.println("Sum is: "+sum);
    }
}
