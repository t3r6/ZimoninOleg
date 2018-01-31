package lesson8.animals;

public class VeterinaryDemo {
    public static void main(String[] args) {
        Veterinary vet = new Veterinary();
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        Horse yourHorse = new Horse();
        myDog.setLocation("на улице в будке");
        myCat.setLocation("в квартире");
        yourHorse.setLocation("конюшне");
        Animal[] patients = {myDog, myCat, yourHorse};
        for (Animal animal : patients) {
            vet.treatAnimal(animal);
            animal.sleep();
        }
    }
}
