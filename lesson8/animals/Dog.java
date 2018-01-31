package lesson8.animals;

public class Dog extends Animal {
    private String barking;

    public Dog(String food, String location, String barking) {
        super(food, location);
        this.barking = barking;
    }

    public Dog(String barking) {
        this.barking = barking;
    }

    public Dog() {

    }

    public String getBarking() {
        return barking;
    }

    public void setBarking(String barking) {
        this.barking = barking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        return barking != null ? barking.equals(dog.barking) : dog.barking == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (barking != null ? barking.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "barking='" + barking + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        System.out.println("гав гав");
    }

    @Override
    public void eat() {
        System.out.println("всё подряд");
    }

    @Override
    public void sleep() {
        System.out.println("достаточно");
    }
}
