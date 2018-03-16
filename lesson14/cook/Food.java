package lesson14.cook;

public class Food {
    public void prepare(Cookable c) {
        c.cook("Cooking");
    }
    public static void main(String[] args) {
        new Food().prepare(System.out::println);
        /*new Food().prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Cooking)");
            }
        });*/
    }
}
