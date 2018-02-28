package lesson7;

public class Person implements Comparable<Person> {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person anotherPerson) {
        int anotherPersonAge = anotherPerson.getAge();
        return this.age - anotherPersonAge;
    }

    public void move() {
        System.out.println(getFullName() + "is moveing!");
    }

    public void talk() {
        System.out.println(getFullName() + "is talking!");
    }
}

