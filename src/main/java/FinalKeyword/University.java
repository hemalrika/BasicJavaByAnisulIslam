package FinalKeyword;

public class University {
    final static String UNIVERSITY_NAME;
    final int fees = 42000;
    static  {
        UNIVERSITY_NAME = "DU";
    }
    void display() {
        System.out.println("University name is: "+UNIVERSITY_NAME);
        System.out.println("Fees: "+fees);
    }
}
