package lesson10.clothes;

public class Atelier {
    public static void dress(Clothe[] clothe) {
        for (Clothe dress : clothe) {
            if (dress instanceof MenClothes) {
                ((MenClothes) dress).dressMen();
                System.out.println("размера " + dress.getSize() + " стоимостью " + dress.getPrice() + " цвета " + dress.getColor());
            } else if (dress instanceof WomenClothes) {
                System.out.println("размера " + dress.getSize() + " стоимостью " + dress.getPrice() + " цвета " + dress.getColor());
            }
        }
    }

    public static void main(String[] args) {
        Clothe[] clothe = {new Trousers(SizeClothes.XS, 36.3, "black"),
                new Tie(SizeClothes.L, 63.2, "grenn"),
                new TShirt(SizeClothes.XS, 23.6, "diamond"), new Skirt(SizeClothes.XS, 36.3, "pink"),
                new TShirt(SizeClothes.L, 56.3, "rainbow")};
        Atelier.dress(clothe);
        Atelier.dress(clothe);
    }
}
