package basic.java.basicjavabyanisulislam;

public class StaticBlock {
    static String name;
    static int id;
    static {
        name = "MD hemal akhand";
        id = 30;
    }
    static void displayInfo() {
        System.out.println("name: "+name);
        System.out.println("ID: "+id);
    }
}
