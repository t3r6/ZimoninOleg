package lesson10.library;

public class Book implements Printable {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return price == book.price;
    }

    @Override
    public int hashCode() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{}";
    }

    @Override
    public void print() {
        System.out.println("Print this book");
    }

    public static void printBook(Printable[] array) {
        for (Printable printable1 : array) {
            if (printable1 instanceof Book) {
                System.out.println(printable1);
            }
        }
    }
}
