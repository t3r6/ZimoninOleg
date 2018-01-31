package lesson8.flowers;

public class Flowers {
    private static int flowersSold;
    private String country;
    private String selfLife;
    private double price;

    public Flowers(String country, String selfLife, double price) {
        this.country = country;
        this.selfLife = selfLife;
        this.price = price;
    }

    public Flowers() {

    }

    public static int getFlowersSold() {
        return flowersSold;
    }

    public static void setFlowersSold(int flowersSold) {
        Flowers.flowersSold = flowersSold;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSelfLife() {
        return selfLife;
    }

    public void setSelfLife(String selfLife) {
        this.selfLife = selfLife;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flowers flowers = (Flowers) o;

        if (Double.compare(flowers.price, price) != 0) return false;
        if (country != null ? !country.equals(flowers.country) : flowers.country != null) return false;
        return selfLife != null ? selfLife.equals(flowers.selfLife) : flowers.selfLife == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = country != null ? country.hashCode() : 0;
        result = 31 * result + (selfLife != null ? selfLife.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "country='" + country + '\'' +
                ", selfLife='" + selfLife + '\'' +
                ", price=" + price +
                '}';
    }

    public static void flowersBouquet(Flowers[] bouquet) {
        double bouquetPrise = 0;
        for (int i = 0; i < bouquet.length; i++) {
            bouquetPrise += bouquet[i].getPrice();
        }
        System.out.println("Букет стоит: " + bouquetPrise + " тугриков");
    }
}

