package com.learntocode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {

        System.out.print("Enter the name of the story/file to read: ");


        Scanner scanner = new Scanner(System.in);


        String fileName = scanner.nextLine();


        File file = new File("Goldilocks.txt");

        try {

            Scanner fileScanner = new Scanner(file);


            int lineNumber = 1;


            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }


            fileScanner.close();

        } catch (FileNotFoundException e) {

            System.out.println("Error: File not found!");
        }


        scanner.close();
    }
}