package lesson10.library;

public class Magazine implements Printable {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Magazine magazine = (Magazine) o;

        return number == magazine.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

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
