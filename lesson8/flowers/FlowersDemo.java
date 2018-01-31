package lesson8.flowers;

public class FlowersDemo {
    public static void main(String[] args) {
        Violets violet1 = new Violets("Somewhere", "пару дней", 5.63, "Великолепные");
        Violets violet2 = new Violets("Somewhere", "3 дня", 6.63, "какие то");
        Roses rose1 = new Roses("Ukraine", "5 days", 10.63, 10.3);
        Roses rose2 = new Roses("Ukraine", "6 days", 15.63, 15.3);
        Tulips tulip1 = new Tulips("Holland", "10 days", 9.53, "red");
        Tulips tulip2 = new Tulips("Holland", "11 days", 11.53, "yellow");
        Carnation carnation1 = new Carnation("My world", "2 days", 89.3, 53.3);
        Carnation carnation2 = new Carnation("Your world", "6 days", 9.3, 3.3);
        Flowers[] bouquet1 = {rose1, rose2, tulip1, tulip2, carnation1, violet2};
        Flowers[] bouquet2 = {violet1, violet2, tulip1, tulip2, carnation1, carnation2};
        Flowers[] bouquet3 = {tulip1, carnation1, rose1, violet1};
        Flowers.flowersBouquet(bouquet1);
        Flowers.flowersBouquet(bouquet2);
        Flowers.flowersBouquet(bouquet3);
        Flowers.setFlowersSold(bouquet1.length + bouquet2.length + bouquet3.length);
        System.out.println("Продано цветов: " + Flowers.getFlowersSold() + " штук");
    }
}
