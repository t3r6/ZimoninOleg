package lesson12;

public class StoryOfTwoStrins {
    public static void main(String[] args) {
        String string = "String";
        String code = "Code";
        String practice = "Practice";
        print(string);
        print(code);
        print(practice);
    }

    private static void print(String string) {
        System.out.println("Для " + string + " две средние буквы будут: " + middleLetters(string));
    }

    public static StringBuilder middleLetters(String string) {
        StringBuilder result = new StringBuilder();
        char a = string.charAt((string.length() / 2) - 1);
        char b = string.charAt(string.length() / 2);
        return result.append(a).append(b);
    }
}
