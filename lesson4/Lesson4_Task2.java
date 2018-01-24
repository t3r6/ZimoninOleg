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
            String trans = Integer.toBinaryString(garland);
            int dlinaStroki = trans.length();
            for (int j = 32; dlinaStroki < j; dlinaStroki++) {
                System.out.print("0");
            }
            System.out.println(trans);
        }
    }

    static void ticker() {
        System.out.println("Введите количество смещений");
        int i = scanGarland();
        for (int k = 0; k < i; k++) {
            garland = garland >> 1;
            String trans = Integer.toBinaryString(garland);
            int dlinaStroki = trans.length();
            for (int j = 32; dlinaStroki < j; dlinaStroki++) {
                System.out.print("0");
            }
            System.out.println(trans);
        }
    }

    static void firstLightBulb() {
        String trans = Integer.toBinaryString(garland);
        int dlinaStroki = trans.length();
        for (int i = 32; dlinaStroki < i; dlinaStroki++) {
            trans = "0" + trans;
        }
        if (trans.charAt(31) == ('1')) {
            System.out.println("Первая лампочка горит!");
        } else {
            System.out.println("Первая лампочка не горит!");
        }
    }

    static void girlandaState() {
        System.out.println("Вот так выглядит ваша гирлянда сейчас");
        String trans = Integer.toBinaryString(garland);
        int dlinaStroki = trans.length();
        for (int i = 32; dlinaStroki < i; dlinaStroki++) {
            System.out.print("0");
        }
        System.out.println(trans);
    }
}
