package oop.Inheritence;

public class Teacher extends Person {
    String qualification;

    void displayInformation2() {
        displayInformation();
        System.out.println("qualification is: "+qualification);
    }
}
