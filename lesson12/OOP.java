package lesson12;

public class OOP {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("This my story about object oriented programming or some like that!");
        String replacement = "object oriented programming";
        System.out.println("Before magic:");
        System.out.println(s);
        System.out.println("After magic:");
        System.out.println((replacementMethod(s, replacement)).toString());
    }

    private static StringBuilder replacementMethod(StringBuilder s, String replacement) {
        for (int i = 0; i < 100; i++) {
            int start = s.indexOf(replacement);
            if (s.toString().contains(replacement)) {
                s.replace(start, start + replacement.length(), "OOP");
            }
        }
        return s;
    }
}
