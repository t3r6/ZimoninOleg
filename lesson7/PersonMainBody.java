package lesson7;

public class PersonMainBody {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("mr Fly", 69);
        person1.talk();
        person2.talk();
        person1.move();
        person2.move();
    }
}
