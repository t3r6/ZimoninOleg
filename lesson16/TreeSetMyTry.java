package lesson16;

import lesson7.Person;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMyTry {
    public static void main(String[] args) {
        SortedSet<Person> newPerson = new TreeSet<>();
        newPerson.add(new Person("Grim", 99));
        newPerson.add(new Person("Jack", 56));
        newPerson.add(new Person("Lisa", 17));
        newPerson.add(new Person("Lira", 19));
        for (Person person : newPerson) {
            System.out.println(person);
        }
    }
}
