package string_package;

public class StringOne {
    public static void main(String[] args) {
        String s1 = "anisul Islam";
        String s2 = new String("Anisul Islam");
        System.out.println("Length Of s2 Is : "+s1.length());
        System.out.println("Length OF s1 iS : "+s1.length());
        boolean isEqualWithCaseSensitive = s1.equals(s2);
        System.out.println("S1 is equal with s2 with case sensitive : "+isEqualWithCaseSensitive);
        boolean isEqualWithoutCaseSensitive = s1.equalsIgnoreCase(s2);
        System.out.println("s1 is equal with s2 without case sensitive : "+isEqualWithoutCaseSensitive);
        boolean isContainText = s1.contains("Islam");
        System.out.println("S1 contains Islam Its : "+isContainText);
        boolean isEmpty = s1.isEmpty();
        System.out.println("S1 is empty, Its : "+isEmpty);
    }
}
