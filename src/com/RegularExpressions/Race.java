package com.RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String input = scanner.nextLine();
        List<String> participants = Arrays.stream(line.split(", ")).collect(Collectors.toList());
        Map<String, Integer> racers = new LinkedHashMap<>();
        String distance = "\\d+";
        String name = "[A-Za-z]+";
        while (!input.equals("end of race")){
            Pattern regex = Pattern.compile(name);
            Matcher matcher = regex.matcher(input);
            String racer = "";
            while (matcher.find()) {
                racer = racer + matcher.group();
            }
            if (participants.contains(racer)) {
                Pattern regD = Pattern.compile(distance);
                Matcher mat = regD.matcher(input);
                String kmS = "";
                while (mat.find()) {
                    kmS = kmS + mat.group();
                }
                int km = Integer.parseInt(kmS);
                if (!racers.containsKey(racer)){
                    racers.put(racer, km);
                } else {
                    racers.put(racer, racers.get(racer) + km);
                }
            }
            input = scanner.nextLine();
        }
        Map<String,Integer> topThree =
                racers.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(3)
                        .collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        int i = 0;
        for(Map.Entry<String,Integer> entry : topThree.entrySet()) {
            if(i==0) {
                System.out.println("1st place: " + entry.getKey());
            } else if(i==1) {
                System.out.println("2nd place: " + entry.getKey());
            } else if(i==2) {
                System.out.println("3rd place: " + entry.getKey());
            }
            i++;
        }
    }
}
