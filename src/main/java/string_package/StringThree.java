package string_package;

public class StringThree {
    public static void main(String[] args) {
        String country = "bangladesh is my country";
        System.out.println(country);
        String CoutryHasSpace = "    Bangladesh is my country  ";
        String CountryNoSpace = CoutryHasSpace.trim();
        System.out.println("Without Space: "+CountryNoSpace);
        char charCountryPos = country.charAt(0);
        System.out.println("First position of country: "+charCountryPos);
        int asciiCountryCodeForFirst = country.codePointAt(0);
        System.out.println("Ascii code of first index is: "+asciiCountryCodeForFirst);
        int indexOfIs = country.indexOf("is");
        System.out.println("Index of \"is\" is: "+indexOfIs);
        int lastIndexY = country.lastIndexOf("y");
        System.out.println("Last index of y in country: "+lastIndexY);
    }
}
