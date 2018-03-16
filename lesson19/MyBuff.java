package lesson19;

import java.io.*;

public class MyBuff {
    public static void main(String[] args) {
        try (BufferedWriter myWriter = new BufferedWriter(new FileWriter("src\\lesson19\\mybuffer.txt"));
             BufferedReader myReader = new BufferedReader(
                     new FileReader("src\\lesson19\\mybuffer.txt"))) {
            String s;
            while ((s = myReader.readLine()) != null) {
                myWriter.write(s);
                myWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
