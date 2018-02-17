package lesson9.fruitShop;

public class Apple extends Fruit {
    private double applePrice;

    public Apple(double weight, double applePrice) {
        super(weight);
        this.applePrice = applePrice;
    }

    public Apple(double applePrice) {
        this.applePrice = applePrice;
    }
    public Apple(){
    }

    public double getApplePrice() {
        return applePrice;
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Apple apple = (Apple) o;

        return Double.compare(apple.applePrice, applePrice) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(applePrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "applePrice=" + applePrice +
                "} " + super.toString();
    }

    @Override
    double fruitPrice(double weight) {
        return applePrice * weight;
    }
}
