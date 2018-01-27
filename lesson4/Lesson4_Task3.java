package lesson4;

public class Lesson4_Task3 {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0;
        for (String incomingDoubles : args) {
            double number = Double.parseDouble(incomingDoubles);
            sum = sum + number;
            count++;
        }
        double mean = sum / count;
        System.out.println(mean);
    }

}
