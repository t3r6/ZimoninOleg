package lesson4;

import java.util.Scanner;

public class Lesson4_Task2 {
    static int garland = 32;

    public static void main(String[] args) {
        System.out.println("Представьте,что у вас есть гирлянда с 32 лампочками");
        System.out.println("Выберите режим работы гилянды задав номер действия");
        System.out.println("1 Мигание");
        System.out.println("2 Бегущая строка");
        System.out.println("3 Проверка горения первой лампочки");
        System.out.println("4 Просто включить");
        System.out.print("Ваш выбор: ");
        int modes = scanGarland();
        switch (modes) {
            case 1:
                flashing();
                break;
            case 2:
                ticker();
                break;
            case 3:
                firstLightBulb();
                break;
            case 4:
                girlandaState();
                break;
            default:
                System.out.println("Неправильно выбрат режим!");
                break;
        }
    }

    static int scanGarland() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Введите целое число!");
            scan.nextLine();
        }
        return scan.nextInt();
    }

    static void flashing() {
        System.out.println("Введите количество миганий");
        int i = scanGarland();
        for (int k = 0; k < i; k++) {
            garland = ~garland;
            printGarland();
        }
    }

    static void ticker() {
        System.out.println("Введите количество смещений");
        int i = scanGarland();
        for (int k = 0; k < i; k++) {
            garland = garland >> 1;
            printGarland();
        }
    }

    static void firstLightBulb() {
        if ((garland & 1) == 1) {
            System.out.println("Первая лампочка горит!");
        } else {
            System.out.println("Первая лампочка не горит!");
        }
    }

    static void girlandaState() {
        System.out.println("Вот так выглядит ваша гирлянда сейчас");
        printGarland();
    }

    public static void printGarland() {
        String trans = Integer.toBinaryString(garland);
        transfiguration(trans);
        System.out.println(trans);
    }

    private static void transfiguration(String trans) {
        int dlinaStroki = trans.length();
        for (int i = 32; dlinaStroki < i; dlinaStroki++) {
            System.out.print("0");
        }
    }
}
