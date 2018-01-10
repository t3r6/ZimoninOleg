package lesson4;

public class Lesson4_Task4 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        if (i % 2 == 0) {
            System.out.println("Что-то не то!");
        } else {
            System.out.println(i);
        }
    }
}
