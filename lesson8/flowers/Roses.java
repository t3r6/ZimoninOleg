package lesson8.flowers;

public class Roses extends Flowers {
    private double legLength;

    public Roses(String country, String selfLife, double price, double legLength) {
        super(country, selfLife, price);
        this.legLength = legLength;
    }

    public Roses(double legLength) {
        this.legLength = legLength;
    }

    public Roses() {

    }

    public double getLegLength() {
        return legLength;
    }

    public void setLegLength(double legLength) {
        this.legLength = legLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Roses roses = (Roses) o;

        return Double.compare(roses.legLength, legLength) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(legLength);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Roses{" +
                "legLength=" + legLength +
                '}';
    }
}
