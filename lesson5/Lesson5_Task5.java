package lesson5;

public class Lesson5_Task5 {
    public static void main(String[] args) {
        int count = 0;
        do {
            if (count % 5 == 0) {
                System.out.println(count);
            }
        } while (count++ < 100);
    }
}
