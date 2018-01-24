package lesson10;

public class Magazine implements Printable {
    @Override
    public void print() {
        System.out.println("Print this magazine");
    }

    @Override
    public String toString() {
        return "Magazine{}";
    }

    public static void printBook(Printable[] array) {
        for (Printable printable1 : array) {
            if (printable1 instanceof Magazine) {
                System.out.println(printable1);
            }
        }
    }
}
