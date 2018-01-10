package lesson5;

public class Lesson5_Task8 {
    public static void main(String[] args) {
        long randomNum = (long) (Math.random() * 5);
        System.out.println(calculationFactorial(randomNum));
    }

    public static long calculationFactorial(long n) {
        int result = 1;
        for (long i = 2; i <= n; i++) {
            n *= i;

            if (n == 0 || n == 1) {
                System.out.println(n);
            }
        }
        return n;
    }
}
