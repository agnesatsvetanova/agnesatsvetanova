package com.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SumBytes {
    public static void main(String[] args)throws Exception {

        Path path = Paths.get("C:\\Users\\User\\Desktop\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt");
        BufferedReader in = Files.newBufferedReader(Paths.get(String.valueOf(path)));
        String line = in.readLine();
        long sum = 0;
        while (line != null){
            for (char c : line.toCharArray()){
                sum += c;
            }
            line = in.readLine();
        }
        System.out.println(sum);
    }
}
