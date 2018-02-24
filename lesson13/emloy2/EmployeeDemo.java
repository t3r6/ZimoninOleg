package lesson13.emloy2;

import java.util.Date;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("Homer",  123.3, new Date(1994,02,5)  ),
                new Employee("Mr. Freemen",  996.4,new Date(1995,9,25)),
                new Employee("Fry",  233.6,new Date(1991,4,27))};
        Report.generateReport(employees);
        System.out.println(employees[0].toString());
        FullReport.fullReport(employees);
    }
}
