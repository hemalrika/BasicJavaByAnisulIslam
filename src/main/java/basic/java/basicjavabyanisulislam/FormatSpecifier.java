package basic.java.basicjavabyanisulislam;

public class FormatSpecifier {
    public static void main(String[] args) {
        boolean b = true;
        char c = 'a';
        short s = 32677;
        int i = 126587;
        float f = 10.2f;
        double d = 10.2;
        System.out.printf("boolean of b is = %b\n",b);
        System.out.printf("char of c is = %c\n",c);
        System.out.printf("short of s is = %d\n",s);
        System.out.printf("integer of i is = %d\n",i);
        System.out.printf("float of f is = %.1f\n",f);
        System.out.printf("double of d is = %.3f\n",d);
    }
}
