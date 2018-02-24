package lesson12.emloy;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = {new Employee("Homer",  123.3),
                new Employee("Mr. Freemen",  996.4),
                new Employee("Fry",  233.6)};
        Report.generateReport(employees);
        System.out.println(employees[0].toString());
    }
}
