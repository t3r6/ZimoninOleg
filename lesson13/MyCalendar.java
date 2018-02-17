package lesson13;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {
    public static void main(String[] args) {
        Calendar myBirthDay = new GregorianCalendar(1991, 3, 21);
        System.out.println(myBirthDay.getTime());
        System.out.println("Month " + myBirthDay.get(Calendar.MONTH));
        System.out.println(myBirthDay.get(Calendar.YEAR));
        System.out.println(myBirthDay.get(Calendar.WEEK_OF_MONTH));
        System.out.println(myBirthDay.get(Calendar.WEEK_OF_YEAR));
        System.out.println(myBirthDay.get(Calendar.DAY_OF_YEAR));
        System.out.println(myBirthDay.get(Calendar.DAY_OF_MONTH));
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(dateFormat.format(myBirthDay.getTime()));
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat2.format(myBirthDay.getTime()));
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateFormat3.format(myBirthDay.getTime()));
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(dateFormat4.format(myBirthDay.getTime()));
    }
}
