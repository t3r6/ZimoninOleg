package lesson8.flowers;

public class Carnation extends Flowers {
    private double size;

    public Carnation(String country, String selfLife, double price, double size) {
        super(country, selfLife, price);
        this.size = size;
    }

    public Carnation(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Carnation carnation = (Carnation) o;

        return Double.compare(carnation.size, size) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(size);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Carnation{" +
                "size=" + size +
                "} " + super.toString();
    }
}
