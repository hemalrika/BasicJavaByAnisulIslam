package oop.Inheritence.Private;

public class MainClass {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("MD hemal akhand");
        t1.setAge(25);
        t1.setQualification("BSC");
        System.out.println("Teacher Name: "+t1.getName());
        System.out.println("Teacher Age: "+t1.getAge());
        System.out.println("Teacher qualification: "+t1.getQualification());
    }
}
