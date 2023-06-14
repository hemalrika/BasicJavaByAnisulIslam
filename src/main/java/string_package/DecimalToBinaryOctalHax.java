package string_package;

public class DecimalToBinaryOctalHax {
    public static void main(String[] args) {
        int decimalNumber = 15;
        String binary = Integer.toBinaryString(decimalNumber);
        String octal = Integer.toOctalString(decimalNumber);
        String hax = Integer.toHexString(decimalNumber);

        System.out.println("Binary: "+binary);
        System.out.println("Octal: "+octal);
        System.out.println("Hax : "+hax);
    }
}
