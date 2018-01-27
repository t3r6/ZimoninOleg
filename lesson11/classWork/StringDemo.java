package lesson11.classWork;

public class StringDemo {
    public static void main(String[] args) {
        String javaJ = "I and they like Java!!!";
        testString(javaJ);
        System.out.println(javaJ.charAt(javaJ.length() - 1));
        System.out.println(javaJ.indexOf("Java"));
        System.out.println(javaJ.replace("a", "o"));
        System.out.println(javaJ.toUpperCase());
        System.out.println(javaJ.toLowerCase());
        System.out.println(javaJ.substring(16, 20));
    }

    public static void testString(String s) {
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
    }
}
