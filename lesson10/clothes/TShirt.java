package lesson10.clothes;

public class TShirt extends Clothe implements MenClothes, WomenClothes {
    public TShirt(SizeClothes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public SizeClothes getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(SizeClothes size) {
        super.setSize(size);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String toString() {
        return "TShirt{} " + super.toString();
    }

    @Override
    public void dressMen() {
        System.out.println("Мужчина надевает футболку ");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надевает футболочку ");
    }
}
