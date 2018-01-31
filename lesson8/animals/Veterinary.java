package lesson8.animals;

public class Veterinary {
    void treatAnimal(Animal animal) {
        System.out.print("Это животное ест: ");
        animal.eat();
        System.out.println("Животное живёт: " + animal.getLocation());
    }
}
