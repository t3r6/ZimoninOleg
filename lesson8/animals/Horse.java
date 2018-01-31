package lesson8.animals;

public class Horse extends Animal {
    private String mane;

    public Horse(String food, String location, String mane) {
        super(food, location);
        this.mane = mane;
    }

    public Horse(String mane) {
        this.mane = mane;
    }

    public Horse() {

    }

    public String getMane() {
        return mane;
    }

    public void setMane(String mane) {
        this.mane = mane;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Horse horse = (Horse) o;

        return mane != null ? mane.equals(horse.mane) : horse.mane == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (mane != null ? mane.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "mane='" + mane + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        System.out.println("И го го");
    }

    @Override
    public void eat() {
        System.out.println("морковку");
    }

    @Override
    public void sleep() {
        System.out.println("сколько дадут");
    }
}
