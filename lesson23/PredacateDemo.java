package lesson23;

import java.util.function.Predicate;

public class PredacateDemo {
    public static void main(String[] args) {
        String src;
        Predicate<String> isNotNull = s -> s != null;
        System.out.println(isNotNull.test(null));
        System.out.println(isNotNull.test("asdf"));

        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println(isNotEmpty.test(""));
        System.out.println(isNotEmpty.test("qwer"));

        Predicate<String> predicate = isNotNull.and(isNotEmpty);
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("asdf"));
        System.out.println(isNotNull.and(isNotEmpty).test("asd"));

        Predicate<String> startWithJ = s -> s.startsWith("J");
        Predicate<String> srartWithN = s -> s.startsWith("N");
        Predicate<String> endWithA = s -> s.endsWith("A");
        Predicate<String> or = srartWithN.or(startWithJ);
        System.out.println(or.and(endWithA).test("JAVA"));
        System.out.println(or.and(endWithA).test("NAVA"));
        System.out.println(or.and(endWithA).test("DAVA"));
    }
}
