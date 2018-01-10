package lesson5;

import java.util.Scanner;

public class Lesson5_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            System.out.println("Введите число от 0 до 10");
            int i = scanner.nextInt();
            if (i >= 0 && i <= 10) {
                System.out.println("Число от ноля до 10");
            } else {
                System.out.printf("Вы ввели не верное число");
            }
        }
    }
}
