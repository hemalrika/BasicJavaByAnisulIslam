package string_package;

public class Autoboxing {
    public static void main(String[] args) {
        // premitive data type -> object
        int x = 30;
        Integer num = Integer.valueOf(x); // regular declaration
        System.out.println("Before Autoboxing: "+num);
        Integer autoBoxNum = x; // autoboxing
        System.out.println("After autoboxing: "+autoBoxNum);
    }
}
