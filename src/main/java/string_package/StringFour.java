package string_package;

public class StringFour {
    public static void main(String[] args) {
        String s1 = new String("This is my country");

        String s2 = s1.replace('i', 'j');
        System.out.println("After Replace: "+s2);

        String[] SpliteText = s1.split(" ");
        for(String x: SpliteText) {
            System.out.println(x);
        }
    }
}
