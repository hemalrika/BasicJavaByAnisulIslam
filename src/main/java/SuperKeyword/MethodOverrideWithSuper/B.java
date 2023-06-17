package SuperKeyword.MethodOverrideWithSuper;

public class B extends A {
    @Override
    void display() {
        super.display();
        System.out.println("Method from B");
    }
}
