package lesson3;

import java.util.Scanner;

public class Lesson3_Task4 {
    public static void main(String[] args) {
        System.out.println("Сумма любимых чисел равна: " + sumOfNumbers());
    }

    public static int sumOfNumbers() {
        int fn = 0, sn = 0;
        System.out.println("Введите любимые два целых числа: ");
        fn = getNumber();
        System.out.println("Введите второе число: ");
        sn = getNumber();
        return fn + sn;
    }

    static int getNumber() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Введите целое число!");
            scan.nextLine();
        }
        return scan.nextInt();
    }
}
