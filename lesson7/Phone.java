package lesson7;

public class Phone {
    private String number;
    private String model;
    private double weight;
    private String name;
    private static int count = 0;


    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;

    }

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
        count++;
    }

    public Phone(String number, String model, double weight, String name) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.name = name;
        count++;
    }

    public Phone() {
        count++;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public static int getCountInstance() {
        return count;
    }

    public void sendMessage(String... numbers) {
        System.out.println();
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    protected void finalize() {
        System.out.println("In finalize");
        count--;
    }
}
