package lesson13;

import java.util.Arrays;

public class InfoOfClass {
    public static void main(String[] args) {
        trueInfoOfClass("".getClass());
    }

    public static void trueInfoOfClass(Class magic) {
        System.out.println("Class of magic - " + magic.getClass());
        System.out.println("Superclass of magic - " + magic.getSuperclass());
        System.out.println("Where package of maic? - " + magic.getPackage());
        System.out.println("Array magic - " + magic.isArray());
        System.out.println("Interace magic - " + magic.isInterface());
        System.out.println("Primitive magic - " + magic.isPrimitive());
    }
}
