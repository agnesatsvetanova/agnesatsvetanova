package com.TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int index = line.lastIndexOf('\\');
        int comma = line.lastIndexOf('.');
        String file = line.substring(index + 1, comma);
        String format = line.substring(comma + 1, line.length());

        System.out.println("File name: " + file);
        System.out.print("File extension: " + format);
    }
}
