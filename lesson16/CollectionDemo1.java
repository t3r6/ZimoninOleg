package lesson16;

import lesson10.clothes.SizeClothes;
import lesson10.clothes.Tie;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo1 {
    public static void main(String[] args) {
        List<Tie> drumStory = new ArrayList<>();
        drumStory.add(new Tie(SizeClothes.S, 2, "red"));
        drumStory.add(new Tie(SizeClothes.XS, 32, "green"));
        System.out.println("Размер тугриков" + drumStory.size());
        for (Tie drum : drumStory) {
            System.out.println("Эллемент " + drum);
        }

        Object[] objects = drumStory.toArray();
        for (Object objects1 : objects) {
            System.out.println();
        }
    }
}
