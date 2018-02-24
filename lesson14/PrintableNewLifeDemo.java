package lesson14;

import lesson10.library.Printable;

public class PrintableNewLifeDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("I'm a live!!!");
            }
        };
        printable.print();
    }
}
