package lesson9.fruitShop;

public class Apricot extends Fruit{
    private double apricotPrice;

    public Apricot(double weight, double apricotPrice) {
        super(weight);
        this.apricotPrice = apricotPrice;
    }

    public Apricot(double apricotPrice) {
        this.apricotPrice = apricotPrice;
    }
    public Apricot(){
    }

    public double getApricotPrice() {
        return apricotPrice;
    }

    public void setApricotPrice(double apricotPrice) {
        this.apricotPrice = apricotPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Apricot apricot = (Apricot) o;

        return Double.compare(apricot.apricotPrice, apricotPrice) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(apricotPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "apricotPrice=" + apricotPrice +
                "} " + super.toString();
    }

    @Override
    double fruitPrice(double weight) {
        return apricotPrice * weight;
    }
}
