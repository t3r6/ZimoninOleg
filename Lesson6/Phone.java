package Lesson6;

public class Phone {
    String number;
    String model;
    double weight;
    String name;

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " С номера " + number);
    }

    public Phone(String n, String m, double w) {
        this(n, m);
        this.weight = w;
    }

    public Phone(String n, String m) {
        this.number = n;
        this.model = m;
    }

    public Phone(String number, String model, double weight, String name) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.name = name;
    }

    public Phone() {
    }

    String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println();
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
