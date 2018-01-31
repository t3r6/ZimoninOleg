package lesson12;

public class PersonInNewLifeDemo {
    public static void main(String[] args) {
        PersonInNewLife person1 = new PersonInNewLife();
        PersonInNewLife person2 = new PersonInNewLife("mr Fly", 69);
        person1.talk(person1.getFullName());
        person2.talk(person2.getFullName());
        person1.move(person1.getFullName());
        person2.move(person2.getFullName());
    }
}
