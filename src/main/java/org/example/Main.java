package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        printFile();
        readerFile();
    }
    public static void printFile() {
        try {
            File file = new File("myFile.txt");

            if (!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file); // записываем данные в файл
            pw.println("First line");
            pw.println("second line");
            pw.println("Hello");
            pw.close();

        } catch (IOException exception) {
            System.out.println("Error: " + exception);
        }
    }

    public static void readerFile() {
        BufferedReader br = null;
        try {
                br = new BufferedReader(new FileReader("myFile.txt"));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }


}