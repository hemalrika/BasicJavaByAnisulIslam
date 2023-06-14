package string_package;

public class ConvertStringAndPremitive {
    public static void main(String[] args) {
        int i = 100;
        String s = Integer.toString(i);
        System.out.println("S = "+s);
         double d = 100.5;
         String s2 = Double.toString(d);
        System.out.println("s2 = "+s2);
        boolean b = true;
        String s3 = Boolean.toString(b);
        System.out.println("s3 : "+s3);

        String s4 = "32";
        //int intVal = Integer.parseInt(s4);
        double dVal = Double.parseDouble(s4);
        //System.out.println("int value intval is: "+intVal);
        System.out.println("Double value dVal is: "+dVal);

        String s5 = "30";
        int intValue2 = Integer.valueOf(s5);
        System.out.println("intvalue2: "+intValue2);
    }
}
