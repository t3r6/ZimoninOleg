package lesson7;

public class PhoneMainBody {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.setNumber("45");
        phone1.setModel("Samsung");
        phone1.setWeight(45.5);
        phone1.setName("Grinc");

        phone2.setNumber("55");
        phone2.setModel("Nokia");
        phone2.setWeight(55.5);
        phone2.setName("Jack Pumpkin King");

        phone3.setNumber("65");
        phone3.setModel("Sony");
        phone3.setWeight(65.5);
        phone3.setName("Someone");

        Phone phone4 = new Phone("345", "Fly", 45.56);

        Phone phone5 = new Phone("599", "Gorgona");

        System.out.println(phone4.getModel());

        System.out.println("Number: " + phone1.getNumber() + " " + phone2.getNumber() + " " + phone3.getNumber());
        System.out.println("Model: " + phone1.getModel() + " " + phone2.getModel() + " " + phone3.getModel());
        System.out.println("Weight: " + phone1.getWeight() + " " + phone2.getWeight() + " " + phone3.getWeight());

        System.out.println("phone4" + phone4.getModel());

        phone1.receiveCall(phone1.getName());
        phone2.receiveCall(phone2.getName(), phone2.getNumber());
        phone3.receiveCall("Grim");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());

        phone2.sendMessage("2", "456");
        System.out.println("You have: " + Phone.getCountInstance() + " phones");
    }
}
