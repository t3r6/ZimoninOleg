package lesson7;

public class Person {
    private String fullName;
    private int age;

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

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }

    public void move(String fullName) {
        System.out.println(getFullName() + "is moveing!");
    }

    public void talk(String fullName) {
        System.out.println(getFullName() + "is talking!");
    }
}

