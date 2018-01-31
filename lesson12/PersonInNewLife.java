package lesson12;

public class PersonInNewLife {
    private String fullName;
    private int age;

    public PersonInNewLife(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public PersonInNewLife() {

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
        return String.format("PersonInNewLife fullName %s age %d", fullName, age);
    }

    public void move(String fullName) {
        System.out.println(getFullName() + "is moveing!");
    }

    public void talk(String fullName) {
        System.out.println(getFullName() + "is talking!");
    }
}
