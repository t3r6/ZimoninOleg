package lesson14.cook;

public class Food {
    public void prepare(Cookable c) {
        c.cook();
    }
    public static void main(String[] args) {
        new Food().prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Cooking)");
            }
        });
    }
}
