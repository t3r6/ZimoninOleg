package lesson9.fruitShop;

public class FruitShop {
    public static void main(String[] args) {
        Apple redApple = new Apple(0.6, 44.3);
        Apple yellowApple = new Apple(1.25, 25.9);
        Pear juicyPear = new Pear(2.36, 85.6);
        Pear yellowPear = new Pear(0.96, 75.3);
        Apricot overseasApricot = new Apricot(0.56, 65.4);
        Apricot localApricot = new Apricot(1.23, 63.7);
        Fruit[] fruits = {redApple, yellowApple, juicyPear, yellowPear, overseasApricot, localApricot};
        System.out.println("Общая стоимость: " + Fruit.fruitCostCalculation(fruits));
        System.out.println("Общая стоимость яблок : " + Apple.fruitCostCalculation(redApple, yellowApple));
        redApple.printManufacturerInfo();
        System.out.println("Общая стоимость груш : " + Pear.fruitCostCalculation(juicyPear, yellowPear));
        juicyPear.printManufacturerInfo();
        System.out.println("Общая стоимость абрикос : " + Apricot.fruitCostCalculation(overseasApricot, localApricot));
        overseasApricot.printManufacturerInfo();
    }
}
