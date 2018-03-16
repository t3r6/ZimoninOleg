package lesson20;

public class NewRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i>10) {
                System.out.println(i);
            }
        }
    }
}
