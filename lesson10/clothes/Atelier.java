package lesson10.clothes;

public class Atelier {
    public static void dressMen(Clothe[] clothe) {
        System.out.println("Мужчина надел:");
        for (Clothe dress : clothe) {
            System.out.println("размера " + dress.getSize() + " стоимостью " + dress.getPrice() + " цвета " + dress.getColor());
        }
    }

    public static void dressWomen(Clothe[] clothe) {
        System.out.println("Женщина надела:");
        for (Clothe dress : clothe) {
            System.out.println("размера " + dress.getSize() + " стоимостью " + dress.getPrice() + " цвета " + dress.getColor());
        }
    }

    public static void main(String[] args) {
        Clothe[] clotheForMen = {new Trousers(SizeClothes.XS, 36.3, "black"),
                new Tie(SizeClothes.L, 63.2, "grenn"),
                new TShirt(SizeClothes.XS, 23.6, "diamond")};
        Clothe[] clotheForwomen = {new Skirt(SizeClothes.XS, 36.3, "pink"),
                new TShirt(SizeClothes.L, 56.3, "rainbow")};
        Atelier.dressMen(clotheForMen);
        Atelier.dressWomen(clotheForwomen);
    }
}
