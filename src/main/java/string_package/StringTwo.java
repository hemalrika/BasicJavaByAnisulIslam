package string_package;

public class StringTwo {
    public static void main(String[] args) {
        String firstname = "Anisul";
        String lastname = " Islam";
        String fullname = firstname.concat(lastname);
        System.out.println("Full name is : "+fullname);
        System.out.println("Full name with uppercase : "+fullname.toUpperCase());
        System.out.println("Full name with lowercase : "+fullname.toLowerCase());
        System.out.println("Full name start with \"A\" : "+fullname.startsWith("A"));
        System.out.println("Full name end with \"I\" : "+fullname.startsWith("I"));
    }
}
