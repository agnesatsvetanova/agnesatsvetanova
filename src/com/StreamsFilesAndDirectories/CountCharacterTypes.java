package com.StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CountCharacterTypes {
    public static void main(String[] args) throws Exception {
        Path pathIn = Paths.get("C:\\Users\\User\\Desktop\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt");
        Path pathOut = Paths.get("C:\\Users\\User\\Desktop\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt");
        BufferedReader in = Files.newBufferedReader(Paths.get(String.valueOf(pathIn)));
        PrintWriter out = new PrintWriter(new FileWriter(String.valueOf(pathOut)));
        List<String> lines = Files.readAllLines(pathIn);
        String line = in.readLine();
        int countVowels = 0;
        int countPunctuation = 0;
        int countConsonants = 0;
        while (line != null) {
            for (char c : line.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    countVowels++;
                } else if (c == '!' || c == ',' || c == '.' || c == '?') {
                    countPunctuation++;
                } else if (c == ' ') {
                    continue;
                } else {
                    countConsonants++;
                }
            }
            line = in.readLine();
        }
        lines.add(String.valueOf(countVowels));
        lines.add(String.valueOf(countPunctuation));
        lines.add(String.valueOf(countConsonants));

        Files.write(pathOut, lines);
        System.out.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d", countVowels, countConsonants, countPunctuation);
    }
}

