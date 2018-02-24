package lesson13.emloy2;

public class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.printf("Смертное создание %s получит %.2f пончиков за свои мучения числа так %td.\n",
                    employee.getFullname(), employee.getSalary(),employee.getSalaryDate());
        }
    }
}
