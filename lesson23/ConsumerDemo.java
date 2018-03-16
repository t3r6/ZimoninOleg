package lesson23;

import lesson10.clothes.SizeClothes;
import lesson10.clothes.Tie;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Tie> consumer = tie -> System.out.println("Гастуки завезли цвета " + tie.getColor());
        consumer.accept(new Tie(SizeClothes.S,234,"red"));
        Consumer<Tie> consumer1 = tie -> System.out.println("Гастуки стащили цвета " + tie.getColor());
        consumer.andThen(consumer1).accept(new Tie(SizeClothes.XS,21,"green"));
    }
}
