package lesson16;

import lesson7.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonIterator {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person());
        list.add(new Person("Grim", 32));
        list.add(new Person("Fly", 12));
        list.add(new Person("Homer", 45));
        System.out.println(list);
        System.out.println(getNewCollection(list));
    }

    public static List<Person> getNewCollection(List<Person> list) {
        List<Person> result = new ArrayList<>();
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person bigPerson = iterator.next();
            if (bigPerson.getAge() > 25) {
                iterator.remove();
                result.add(bigPerson);
            }
        }
        return result;
    }
}
