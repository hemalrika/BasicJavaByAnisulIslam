package string_package;

public class BinaryOctalHaxToDecimal {
    public static void main(String[] args) {
        String binary = "1010110010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal of binary is: "+decimal);

        String octal = "671";
        Integer decimalTwo = Integer.parseInt(octal, 8);
        System.out.println("Octal to decimal is: "+decimalTwo);

        String Hax = "A";
        Integer decimalThree = Integer.parseInt(Hax, 16);
        System.out.println("Hax to decimal is: "+decimalThree);
    }
}
