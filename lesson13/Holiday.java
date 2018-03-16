package lesson13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Holiday {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar[] holidays = {new GregorianCalendar(2018, 4, 10),
                new GregorianCalendar(2018, 2, 21),
                new GregorianCalendar(2018, 2, 12)};
        for (Calendar calendar : holidays) {
            System.out.println(dateFormat.format(calendar.getTime()) + " cвято наближаеться (^_^)");
        }
    }
}
