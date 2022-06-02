package com.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class AllCapitals {
    public static void main(String[] args) throws Exception {
        Path pathOut = Paths.get("C:\\Users\\User\\Desktop\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt");
        Path path = Paths.get("C:\\Users\\User\\Desktop\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt");
        BufferedReader in = Files.newBufferedReader(Paths.get(String.valueOf(path)));
        PrintWriter out = new PrintWriter(new FileWriter(String.valueOf(pathOut)));
        List<String> lines = Files.readAllLines(path);
        String line = in.readLine();
        while (line != null){
            line = line.toUpperCase(Locale.ROOT);
            System.out.println(line);
            lines = lines.stream().filter(l -> !l.isBlank()).collect(Collectors.toList());
            Files.write(pathOut, lines);
            line = in.readLine();
        }
    }
}
