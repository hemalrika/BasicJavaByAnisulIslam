package DateTimeFormat;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class timeFormat {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formateTime = formatter.format(time);
        System.out.println("Now time is: "+formateTime);
    }

}
