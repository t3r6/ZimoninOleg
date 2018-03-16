package lesson20;

public class MySyn extends Thread {
    StringBuilder stringBuilder;

    public MySyn(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.println(stringBuilder);
            }
            System.out.println();
            char letter = stringBuilder.charAt(0);
            stringBuilder.setCharAt(0, ++letter);
        }
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("A");
        MySyn tread1 = new MySyn(stringBuilder);
        MySyn tread2 = new MySyn(stringBuilder);
        MySyn tread3 = new MySyn(stringBuilder);

        tread1.start();
        tread2.start();
        tread3.start();
    }
}
