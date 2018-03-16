package lesson18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
    public static void main(String[] args) {
        char[] in = new char[50];
        int size = 0;
        File file = new File("fileWrite.txt");
        try (FileWriter fw = new FileWriter("b.txt");
             FileReader fr = new FileReader(file);) {
            size = fr.read(in);
            for (int i = 0; i < size; i++) {
                fw.write(in[i]);
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
