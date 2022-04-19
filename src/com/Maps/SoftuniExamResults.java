package com.Maps;

import java.util.*;

public class SoftuniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, Integer> languages = new LinkedHashMap<>();
        Map<String, Integer> contestants = new LinkedHashMap<>();
        while (!command.equals("exam finished")) {
            String[] line = command.split("-");
            String username = line[0];
            String language = line[1];
            if (!command.contains("banned")) {
                int points = Integer.parseInt(line[2]);
                if (!languages.containsKey(language)){
                    languages.put(language, 1);
                } else {
                    languages.put(language, languages.get(language) + 1);
                }
                if (!contestants.containsKey(username)){
                    contestants.put(username, points);
                } else {
                    if(contestants.get(username) < points) {
                        contestants.put(username, points);
                    }
                }
            } else {
                contestants.remove(username);
            }
            command = scanner.nextLine();
        }
        System.out.print("Results:\n");
        for(Map.Entry<String, Integer> contestant : contestants.entrySet()){
            System.out.println(contestant.getKey() + " | " + contestant.getValue());
        }
        System.out.print("Submissions:\n");
        for(Map.Entry<String, Integer> language : languages.entrySet()){
            System.out.println(language.getKey() + " - " + language.getValue());
        }
    }
}
