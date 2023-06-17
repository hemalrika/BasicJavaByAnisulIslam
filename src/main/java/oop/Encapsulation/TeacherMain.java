package oop.Encapsulation;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("MD hemal akhand");
        t1.setAge(25);
        System.out.println("Username: "+t1.getName());
        System.out.println("Age: "+t1.getAge());
    }
}
