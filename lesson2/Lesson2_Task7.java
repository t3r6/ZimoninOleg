package lesson2;

import java.util.Scanner;

public class Lesson2_Task7 {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        numbers(getNumber);
    }

    static int scanner(Scanner getNumber) {
        while (!getNumber.hasNextInt()) {
            System.out.println("Введите целое число!");
            getNumber.nextLine();
        }
        int i = getNumber.nextInt();
        return i;
    }

    public static void numbers(Scanner getNumber) {
        System.out.println("Введите два целых числа: ");
        int firstNum = scanner(getNumber);
        System.out.println("Теперь второе: ");
        int secondNum = scanner(getNumber);
        int result = firstNum + secondNum;
        System.out.println("Сумма этих чисел равна: " + result);
    }
}
