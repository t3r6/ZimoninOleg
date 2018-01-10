package lesson4;

import java.util.Scanner;

public class Lesson4_Task1 {
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
        System.out.println("Введите 3 целых числа: ");
        int firstNumber = scanner(getNumber);
        System.out.println("Введите следующие число: ");
        int secondNumber = scanner(getNumber);
        System.out.println("Введите последнее число: ");
        int thirdNumber = scanner(getNumber);
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Меньшее число: ");
            System.out.println(secondNumber > thirdNumber ? thirdNumber : secondNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Меньшее число: ");
            System.out.println(firstNumber > thirdNumber ? thirdNumber : firstNumber);
        } else {
            System.out.println("Меньшее число: ");
            System.out.println(thirdNumber > firstNumber && firstNumber > secondNumber ? secondNumber : firstNumber);
        }
    }
}
