package lesson7;

import java.util.Scanner;

public class Recurse {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        System.out.println("Введите два целых числа!");
        firstNumber = getNumber();
        secondNumber = getNumber();
        comparisonNumbers(firstNumber, secondNumber);
    }

    static int getNumber() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Введите целое число!");
            scan.nextLine();
        }
        return scan.nextInt();
    }

    public static void comparisonNumbers(int first, int second) {
        if (first < second) {
            minorityFirst(first, second);
        } else {
            minoritySecond(first, second);
        }
    }

    public static int minorityFirst(int first, int second) {
        int conclusion;
        if (first == second) {
            return second;
        }
        conclusion = minorityFirst((first + 1), second);
        System.out.println(first);
        return conclusion;
    }

    public static int minoritySecond(int first, int second) {
        int conclusion;
        if (first == second) {
            return second;
        }
        conclusion = minoritySecond((first - 1), second);
        System.out.println(first);
        return conclusion;
    }
}
