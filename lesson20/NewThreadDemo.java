package lesson20;

public class NewThreadDemo {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        Thread tread1 = new Thread(newThread);
        tread1.setName("First Thread");
        Thread tread2 = new Thread(newThread);
        tread1.setName("Second Thread");
        newThread.start();
    }
}
