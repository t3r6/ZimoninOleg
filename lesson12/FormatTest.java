package lesson12;

import java.util.Formatter;

public class FormatTest {
    public static void main(String[] args) {
        getInfo("Няшкин", 5, "няшность");
    }

    public static void getInfo(String lastName, int mark, String lesson) {
        System.out.format(" получил %15s оценку %3d по предмету %10s", lastName, mark, lesson);
    }
}
