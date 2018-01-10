package lesson3;

import java.util.Scanner;

public class Lesson3_Task3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        int num = scanner();
        if (num % 2 == 0) {
            System.out.println("Вы ввели четное число!");
        } else {
            System.out.println("Вы ввели нечетное число!");
        }
    }

    static int scanner() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Вы ввели не чесло! Введите число: ");
            scan.nextLine();
        }
        int i = scan.nextInt();
        return i;
    }
}
