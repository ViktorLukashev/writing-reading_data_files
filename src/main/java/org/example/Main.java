package org.example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("myFile.txt");

            if (!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file); // записываем данные в файл
            pw.println("First line");
            pw.println("Hello");
            pw.close();

        } catch (IOException exception) {
            System.out.println("Error: " + exception);
        }
    }
}