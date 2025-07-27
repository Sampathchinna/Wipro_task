package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2_TryCatchFinally {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            File file = new File("input.txt");
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        } finally {
            if (sc != null) {
                sc.close();
                System.out.println("Scanner closed.");
            }
        }
    }
}

