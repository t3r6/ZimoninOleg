package lesson2;

import java.util.Scanner;

public class Lesson2_Task7 {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        getNumbers(getNumber);
    }

    static int getScanner(Scanner getNumber) {
        while (!getNumber.hasNextInt()) {
            System.out.println("Введите целое число!");
            getNumber.nextLine();
        }
        return getNumber.nextInt();
    }

    public static void getNumbers(Scanner getNumber) {
        System.out.println("Введите два целых числа: ");
        int firstNum = getScanner(getNumber);
        System.out.println("Теперь второе: ");
        int secondNum = getScanner(getNumber);
        int result = firstNum + secondNum;
        System.out.println("Сумма этих чисел равна: " + result);
    }
}
