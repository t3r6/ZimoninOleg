package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5_Task17 {
    public static void main(String[] args) {
        int[] garland = createGarlandArray();
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
                flashing(garland);
                break;
            case 2:
                ticker(garland);
                break;
            case 3:
                firstLightBulb(garland);
                break;
            case 4:
                garlandaState(garland);
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

    public static int[] createGarlandArray() {
        int[] arr = new int[32];
        int i;
        for (i = 0; i < 32; i++) {
            int toArray = (int) (Math.random() * 2);
            arr[i] = toArray;
        }
        return arr;
    }

    static void flashing(int[] garlandArr) {
        int[] flashingGarland = new int[32];
        int i, tmp = 0;
        System.out.println("Введите количество миганий");
        int j = scanGarland();
        for (int k = 0; k < j; k++) {
            for (i = 0; i < 32; i++) {
                if ((garlandArr[i]) == 0) {
                    tmp = 1;
                } else {
                    tmp = 0;
                }
                flashingGarland[i] = tmp;
            }
            System.out.println(Arrays.toString(garlandArr));
            System.out.println(Arrays.toString(flashingGarland));
        }
    }

    static void ticker(int[] garlandArr) {
        System.out.println("Введите количество смещений");
        int biasNumber = scanGarland();
        for (int i = 0; i < biasNumber; i++) {
            int[] flashingGarland = new int[32];
            System.arraycopy(garlandArr, 0, flashingGarland, i, (32 - i));
            System.out.println(Arrays.toString(flashingGarland));
        }
    }

    static void firstLightBulb(int[] garlandArr) {
        if (garlandArr[0] == 0) {
            System.out.println("Первая лампочка горит!");
        } else {
            System.out.println("Первая лампочка не горит!");
        }
    }

    static void garlandaState(int[] garlandArr) {
        System.out.println(Arrays.toString(garlandArr));
    }
}
