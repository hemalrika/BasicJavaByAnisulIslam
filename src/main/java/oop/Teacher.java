package oop;

public class Teacher {
    String name, gander;
    int phone;
    Teacher(String getName, String getGander, int getPhone) {
        name = getName;
        gander = getGander;
        phone = getPhone;
    }
    void setInformation(String getName, String getGander, int getPhone) {
        name = getName;
        gander = getGander;
        phone = getPhone;
    }
    void displayInformation() {
        System.out.println("Phone: "+phone);
        System.out.println("name: "+name);
        System.out.println("Gander: "+gander);
    }
}
