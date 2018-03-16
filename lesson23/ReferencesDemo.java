package lesson23;

import java.util.function.IntFunction;
import java.util.function.Supplier;

public class ReferencesDemo {
    public static void main(String[] args) {
        IntFunction<String> function = String::valueOf;
        System.out.println(function.apply(450));

        Supplier<String> newString = String::new;
        System.out.println(newString.get());
    }
}
