package com.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("C:\\Users\\User\\Desktop\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt");

        try(BufferedReader in = Files.newBufferedReader(Paths.get(String.valueOf(path)))){
            String line = in.readLine();
            while (line != null){
                int sum = 0;
                for (char c : line.toCharArray()){
                    sum += c;
                }
                System.out.println(sum);
                line = in.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
