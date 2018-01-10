package lesson5;

public class Lesson5_Task11 {
    public static void main(String[] args) {
        String[][] story = new String[3][6];
        char c = 'a';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                story[i][j] = c + "" + (j + 1);
            }
            c++;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(story[i][j] + " ");
            }
            System.out.println();
        }
    }
}
