package com.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws Exception {
        Path pathOne = Paths.get("C:\\Users\\User\\Desktop\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputOne.txt");
        Path pathTwo = Paths.get("C:\\Users\\User\\Desktop\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputTwo.txt");
        List<String> all= new ArrayList<>();
        BufferedReader in = Files.newBufferedReader(Paths.get(String.valueOf(pathOne)));
        String line = in.readLine();
        while (line != null){
            all.add(line);
            line = in.readLine();
        }

        BufferedReader two = Files.newBufferedReader(Paths.get(String.valueOf(pathTwo)));
        line = two.readLine();
        while (line != null){
            all.add(line);
            line = two.readLine();
        }

        Path pathThree = Paths.get("C:\\Users\\User\\Desktop\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\third.txt");

        for (String s : all){
            System.out.println(s);
        }
        Files.write(pathThree, all);
    }
}
