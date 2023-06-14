package string_package;

public class StringPalindrome {
    public static void main(String[] args) {
        /*
        * jodi main string and reverce string same hoy tahole Palindrome hobe
        * */
        String s1 = "madam";
        StringBuffer sb = new StringBuffer((s1));
        String s2 = sb.reverse().toString();
        if(s1.equals(s2)) {
            System.out.println("Its Palindrome string");
        } else {
            System.out.println("Its not Palindrome");
        }
    }
}
