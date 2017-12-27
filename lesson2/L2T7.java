package lesson2;

import java.util.Scanner;

public class L2T7 {
    public static void main(String[] args) {
        System.out.println("Введите два целых числа: ");
        int firstNum = scanner();
        System.out.println("Теперь второе: ");
        int secondNum = scanner();
        int result = firstNum + secondNum;
        System.out.println("Сумма этих чисел равна: " + result);
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
