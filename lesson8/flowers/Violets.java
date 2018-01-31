package lesson8.flowers;

public class Violets extends Flowers {
    private String type;

    public Violets(String country, String selfLife, double price, String type) {
        super(country, selfLife, price);
        this.type = type;
    }

    public Violets(String type) {
        this.type = type;
    }

    public Violets() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Violets violets = (Violets) o;

        return type != null ? type.equals(violets.type) : violets.type == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Violets{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
