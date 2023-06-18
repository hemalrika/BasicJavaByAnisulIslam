package ThisKeyword;

public class Person {
    String name;
    int age;
    String color;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(String name, int age, String color) {
        this(name, age);
        this.color = color;
    }
    void display() {
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("color: "+color);
    }
}
