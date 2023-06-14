package basic.java.basicjavabyanisulislam;

public class StaticStudent {
    String name;
    int id;
    static String university_name = "MMSC";

    StaticStudent(String n, int i) {
        name = n;
        id = i;
    }
    public void StaticStudentGetInfo() {
        System.out.println("Student name: "+name);
        System.out.println("Student id: "+id);
        System.out.println("Student University: "+university_name);
    }
}
