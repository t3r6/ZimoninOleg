package lesson10.clothes;

public abstract class Clothe {
    SizeClothes size;
    private double price;
    private String color;

    public Clothe(SizeClothes size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Clothe() {

    }

    public SizeClothes getSize() {
        return size;
    }

    public void setSize(SizeClothes size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clothe clothe = (Clothe) o;

        if (Double.compare(clothe.price, price) != 0) return false;
        if (size != clothe.size) return false;
        return color != null ? color.equals(clothe.color) : clothe.color == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = size != null ? size.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
