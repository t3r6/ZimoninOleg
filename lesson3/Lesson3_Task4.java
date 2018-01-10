package lesson3;

import java.util.Scanner;

public class Lesson3_Task4 {
    public static void main(String[] args) {
        int fn = 0, sn = 0;
        System.out.println("Сумма любимых чисел равна: " + sumOfNumbers(fn, sn));
    }

    public static int sumOfNumbers(int fn, int sn) {
        System.out.println("Введите любимые два целых числа: ");
        fn = scanner();
        System.out.println("Введите второе число: ");
        sn = scanner();
        return fn + sn;
    }

    static int scanner() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Введите целое число!");
            scan.nextLine();
        }
        int i = scan.nextInt();
        return i;
    }
}
