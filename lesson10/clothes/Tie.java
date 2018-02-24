package lesson10.clothes;

import java.io.Serializable;

public class Tie extends Clothe implements MenClothes, Serializable {
    public Tie(SizeClothes size, double price, String color) {
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
        return "Tie{} " + super.toString();
    }

    @Override
    public void dressMen() {

    }
}
