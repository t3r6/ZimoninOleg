package lesson13.emloy2;

public class FullReport {
    public static void fullReport(Employee[] employees) {
        for (Employee g : employees) {
            System.out.printf("Тот самый %s получает %.2f в месяц %td.\n", g.getFullname(), g.getSalary(), g.getSalaryDate());
        }
    }
}
