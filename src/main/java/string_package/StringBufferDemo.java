package string_package;

public class StringBufferDemo {
    public static void main(String[] args) {
        /**
         * Basically StringBuffer ekta  string jeitake modify kora jay
         */
        StringBuffer student = new StringBuffer("MD Hemal");
        student.append(" Akhand");
        System.out.println("My Name Is: "+student);
        /* student.delete(2, 5);
            System.out.println("After Delete: "+student);
        */
        /*student.reverse();
        System.out.println("After reverce: "+student);*/
        student.setLength(5);
        System.out.println("After set set length: "+student);

    }
}
