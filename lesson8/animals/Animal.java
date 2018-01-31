package lesson8.animals;

public abstract class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public Animal() {

    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (food != null ? !food.equals(animal.food) : animal.food != null) return false;
        return location != null ? location.equals(animal.location) : animal.location == null;
    }

    @Override
    public int hashCode() {
        int result = food != null ? food.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public abstract void makeNoise();

    public abstract void eat();

    public abstract void sleep();
}
