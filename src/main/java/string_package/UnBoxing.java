package string_package;

public class UnBoxing {
    public static void main(String[] args) {
        // object->premitive data type
        Double d = new Double(-8);
        //double e = d.doubleValue();
        double e = d; // unboxing
        System.out.println("value of e is: "+e);


    }
}
