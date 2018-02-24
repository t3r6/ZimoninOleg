package lesson16;

import java.util.Set;
import java.util.TreeSet;

public class ShopStory {
    public static void main(String[] args) {
        Set<Product> products = new TreeSet<>();
        products.add(new Product("Toy", 45.6, 2));
        products.add(new Product("His toy", 34.7, 1));
        products.add(new Product("My toy", 99.9, 5));
        products.add(new Product("Boots", 23.6, 4));
        products.add(new Product("Ball", 15.7, 3));
        Category category = new Category("Fly", products);
        for (Product product1 : products) {
            System.out.println(product1);
        }
        System.out.println("Next");
        Set<Product> products1 = new TreeSet<>(new ComparatorProductName());
        products1.addAll(products);
        for (Product product : products1) {
            System.out.println(product);
        }
        System.out.println("after");
        Set<Product> products2 = new TreeSet<>(new ComparatorProductPrice());
        products2.addAll(products);
        for (Product product : products2) {
            System.out.println(product);
        }
    }
}
