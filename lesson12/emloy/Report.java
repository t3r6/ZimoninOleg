package lesson12.emloy;

public class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.printf("Смертное создание %s получит %.2f пончиков за свои мучения.\n", employee.getFullname(), employee.getSalary());
        }
    }
}
