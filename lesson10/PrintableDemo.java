package lesson10;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable book = new Book();
        Printable magazine = new Magazine();
        Printable[] printable = {book, magazine};
        Book.printBook(printable);
        Magazine.printBook(printable);
    }
}
