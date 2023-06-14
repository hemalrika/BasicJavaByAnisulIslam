package basic.java.basicjavabyanisulislam;

public class CallByReffrenceMain {
    public static void main(String[] args) {
        CallByReffrence r1 = new CallByReffrence();
        r1.name = "kamal";
        System.out.println(r1.name);
        r1.change(r1);
        System.out.println(r1.name);
    }
}
