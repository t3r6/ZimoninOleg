package lesson13.emloy2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee[] employees = {new Employee("Homer", 123.3, new GregorianCalendar(1995, 25, 5)),
                new Employee("Mr. Freemen", 996.4, new GregorianCalendar(1986, 5, 10)),
                new Employee("Fry", 233.6, new GregorianCalendar(1991, 4, 27))};
        Report.generateReport(employees);
        System.out.println(employees[0].toString());
        FullReport.fullReport(employees);
    }
}
