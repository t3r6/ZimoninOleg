package Lesson7;

public class PhoneMainBody {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.number = "45";
        phone1.model = "Samsung";
        phone1.weight = 45.5;
        phone1.name = "Grinch";

        phone2.number = "55";
        phone2.model = "Nokia";
        phone2.weight = 55.5;
        phone2.name = "Jack Pumpkin King";

        phone3.number = "65";
        phone3.model = "Sony";
        phone3.weight = 65.5;
        phone3.name = "Someone";

        System.out.println("Number: " + phone1.number + " " + phone2.number + " " + phone3.number);
        System.out.println("Model: " + phone1.model + " " + phone2.model + " " + phone3.model);
        System.out.println("Weight: " + phone1.weight + " " + phone2.weight + " " + phone3.weight);

        phone1.receiveCall();
        phone2.receiveCall();
        phone3.receiveCall();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
    }
}
