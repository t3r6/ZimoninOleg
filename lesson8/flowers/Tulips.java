package lesson8.flowers;

public class Tulips extends Flowers {
    private String color;

    public Tulips(String country, String selfLife, double price, String color) {
        super(country, selfLife, price);
        this.color = color;
    }

    public Tulips(String color) {
        this.color = color;
    }

    public Tulips() {

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
        if (!super.equals(o)) return false;

        Tulips tulips = (Tulips) o;

        return color != null ? color.equals(tulips.color) : tulips.color == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tulips{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
