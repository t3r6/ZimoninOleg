package lesson18;

import java.io.*;

public class FileInputOutputStreamDemoMy {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("Zimonin_O/lesson17/a.txt");
             InputStream input = new FileInputStream("Zimonin_O/lesson17/a.txt");
        ) {
            char[] c = {'a', 'b', 'c'};
            // Создание текстового файла
            for (char symbol : c) {
                // Запись каждого символа в текстовый файл
                output.write(symbol);
            }

            int size = input.available();

            for (int j = 0; j < size; j++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }

        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
