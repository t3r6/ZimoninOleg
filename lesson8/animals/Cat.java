package lesson8.animals;

public class Cat extends Animal {
    private String purr;

    public Cat(String food, String location, String purr) {
        super(food, location);
        this.purr = purr;
    }

    public Cat(String purr) {
        this.purr = purr;
    }

    public Cat() {

    }

    public String getPurr() {
        return purr;
    }

    public void setPurr(String purr) {
        this.purr = purr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return purr != null ? purr.equals(cat.purr) : cat.purr == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (purr != null ? purr.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "purr='" + purr + '\'' +
                "} " + super.toString();
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Мур мур");
    }

    @Override
    public void eat() {
        System.out.println("Деликатесы");
    }

    @Override
    public void sleep() {
        System.out.println("18 часов");
    }
}
