package lesson16;

import lesson7.Person;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequePerson {
    public static void main(String[] args) {
        Deque<Person> lastPerson = new ArrayDeque<>();
        Person jim = new Person("Jimmy", 34);
        lastPerson.offer(new Person("Fly", 2));
        lastPerson.offer(new Person("Jack", 24));
        lastPerson.offer(jim);
        while (!lastPerson.isEmpty()) {
            System.out.println(lastPerson.poll() + " ");
        }
    }
}
