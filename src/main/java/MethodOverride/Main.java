package MethodOverride;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.age = 20;
        t1.name = "MD hemal akhand";
        t1.qualification = "SSC";
        t1.displayInformation();

        Person p1 = new Person();
        p1.age = 30;
        p1.name = "Kamal";
        p1.displayInformation();
    }
}
