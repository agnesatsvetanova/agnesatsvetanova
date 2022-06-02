package com.StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount {
    public static void main(String[] args) throws Exception{
        Path pathWords = Paths.get("C:\\Users\\User\\Desktop\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\words.txt");
        List<String> p = new ArrayList<>();
        String word = "";
        BufferedReader in = Files.newBufferedReader(Paths.get(String.valueOf(pathWords)));
        String line = in.readLine();
        while (line != null){
            word += line;
            line = in.readLine();
        }
        String[] words = word.split(" ");
        for (int i = 0; i < words.length; i++) {
            p.add(words[i]);
        }
        Path pathText = Paths.get("C:\\Users\\User\\Desktop\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\text.txt");
        BufferedReader br = Files.newBufferedReader(Paths.get(String.valueOf(pathText)));
        Map<String, Integer> occurrences = new TreeMap<>();
        int count = 1;
        line = br.readLine();
        while (line != null){
            String[] input = line.split(" ");
            for (int i = 0; i < input.length; i++) {
                String w = input[i];
                if (p.contains(w)){
                    if (!occurrences.containsKey(w)){
                        occurrences.put(w, count);
                    } else {
                        occurrences.put(w, occurrences.get(w) + 1);
                    }
                }
            }
            line = br.readLine();
        }
        LinkedHashMap<String, Integer> map2 =
                occurrences.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .collect(Collectors.toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> null, // or throw an exception
                                LinkedHashMap::new));

        List<String> out = new ArrayList<>();
        for (Map.Entry<String, Integer> w : map2.entrySet()){
            String o = w.getKey() + " - " + w.getValue();
            out.add(o);
            System.out.println(w.getKey() + " - " + w.getValue());
        }
        Path pathR = Paths.get("C:\\Users\\User\\Desktop\\Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\results.txt");

        Files.write(pathR, out);
    }
}
