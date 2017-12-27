package Lesson3;

import java.util.Scanner;

public class L3T4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fn, sn;
        System.out.println("Введите любимые два целых числа: ");
        if (scanner.hasNextInt()) {
            fn = scanner.nextInt();
            System.out.println("Введите второе число: ");
            if (scanner.hasNextInt()) {
                sn = scanner.nextInt();
                System.out.println("Сумма любимых чисел равна: " + (fn + sn));
            } else {
                System.out.println("Кто-то не знает что такое целое число!");
                System.out.println("Как выучишь, приходи снова!");
            }
        } else {
            System.out.println("Кто-то не знает что такое целое число!");
            System.out.println("Как выучишь, приходи снова!");
        }
    }
}
