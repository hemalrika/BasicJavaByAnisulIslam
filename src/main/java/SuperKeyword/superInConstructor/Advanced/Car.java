package SuperKeyword.superInConstructor.Advanced;

public class Car extends Vehicle {
    // color, weight, attribute
    int gear;
    Car(String c, double w, int g) {
        super(c, w); //calling the constructor of vahicle
        gear = g;
    }

    @Override
    void attribute() {
        super.attribute();
        System.out.println("Gear is: "+gear);
    }
}
