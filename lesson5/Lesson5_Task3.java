package lesson5;

public class Lesson5_Task3 {
    public static void main(String[] args) {
        int date = 6;
        String week;
        switch (date) {
            case 1:
                System.out.println("Пн");
                break;
            case 2:
                System.out.println("Вт");
                break;
            case 3:
                System.out.println("Ср");
                break;
            case 4:
                System.out.println("Чт");
                break;
            case 5:
                System.out.println("Пт");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                week = "Not a Date";
        }
    }
}
