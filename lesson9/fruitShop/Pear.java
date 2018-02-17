package lesson9.fruitShop;

public class Pear extends Fruit {
    private double pearPrice;

    public Pear(double weight, double pierPrice) {
        super(weight);
        this.pearPrice = pierPrice;
    }

    public Pear(double pierPrice) {
        this.pearPrice = pierPrice;
    }

    public Pear() {
    }

    public double getPierPrice() {
        return pearPrice;
    }

    public void setPierPrice(double pierPrice) {
        this.pearPrice = pierPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pear pear = (Pear) o;

        return Double.compare(pear.pearPrice, pearPrice) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(pearPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Pear{" +
                "pierPrice=" + pearPrice +
                "} " + super.toString();
    }

    @Override
    double fruitPrice(double weight) {
        return pearPrice * weight;
    }
}
