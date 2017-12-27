package Lesson6;

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

        Phone phone4 = new Phone("345", "Fly", 45.56);

        Phone phone5 = new Phone("599", "Gorgona");

        System.out.println(phone4.model);

        System.out.println("Number: " + phone1.number + " " + phone2.number + " " + phone3.number);
        System.out.println("Model: " + phone1.model + " " + phone2.model + " " + phone3.model);
        System.out.println("Weight: " + phone1.weight + " " + phone2.weight + " " + phone3.weight);

        System.out.println("phone4" + phone4.model);

        phone1.receiveCall(phone1.name);
        phone2.receiveCall(phone2.name, phone2.number);
        phone3.receiveCall("Grim");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());

        phone2.sendMessage("2","456");
    }
}
