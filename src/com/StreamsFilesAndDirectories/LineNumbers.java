package com.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) throws Exception {
        Path pathIn = Paths.get("C:\\Users\\User\\Desktop\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputLineNumbers.txt");
        Path pathOut = Paths.get("C:\\Users\\User\\Desktop\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt");
        BufferedReader in = Files.newBufferedReader(Paths.get(String.valueOf(pathIn)));
        PrintWriter out = new PrintWriter(new FileWriter(String.valueOf(pathOut)));
        List<String> lines = Files.readAllLines(pathIn);
        String line = in.readLine();
        int count = 1;
        while (line != null){
            String row = count + ". " + line;
            System.out.println(row);
            lines.add(row);
            count++;
            line = in.readLine();
        }
        Files.write(pathOut, lines);
    }
}
