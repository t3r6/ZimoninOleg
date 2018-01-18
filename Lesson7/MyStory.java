package Lesson7;

/**
 * Created by IT_School on 12/27/2017.
 */
public class MyStory {
    public static void main(String[] args) {
        Description reader1 = new Description();
        Description reader2 = new Description();

        reader1.readerNames = "Fry";
        reader2.readerNames = "Gordon";

        reader1.story();
        reader2.story();
    }
}
