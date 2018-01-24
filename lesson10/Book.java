package lesson10;

public class Book implements Printable {
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
