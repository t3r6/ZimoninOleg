package lesson4;

import java.util.Scanner;

public class Lesson4_Task1 {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        numbers(getNumber);
    }

    static int getNumber(Scanner getNumber) {
        while (!getNumber.hasNextInt()) {
            System.out.println("Введите целое число!");
            getNumber.nextLine();
        }
        return getNumber.nextInt();
    }

    public static void numbers(Scanner getNumber) {
        System.out.println("Введите 3 целых числа: ");
        int firstNumber = getNumber(getNumber);
        System.out.println("Введите следующие число: ");
        int secondNumber = getNumber(getNumber);
        System.out.println("Введите последнее число: ");
        int thirdNumber = getNumber(getNumber);
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
