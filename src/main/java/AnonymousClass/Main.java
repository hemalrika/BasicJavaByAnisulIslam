package AnonymousClass;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person() {
            @Override
            public void display() {
                System.out.println("hello from annonymous");
            }
        };
        p1.display();
    }
}
