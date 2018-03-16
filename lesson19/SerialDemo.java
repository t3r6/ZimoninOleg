package lesson19;

import java.io.*;

public class SerialDemo {
    private static final String FILE_NAME = "horse.ser";

    public static void main(String[] args) {
        Horse horse = new Horse();
        serial(horse);
    }

    public static void serial(Horse horse) {
        try (ObjectOutputStream serialOut = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            serialOut.writeObject(horse);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Horse deserial() {
        Horse horse = null;
        try (ObjectInputStream deserialIn = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            horse = (Horse) deserialIn.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return horse;
    }
}
