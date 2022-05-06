package com.SoftUniExamsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<String> destinations = new ArrayList<>();
        String pattern = "=(?<Destination>([A-Z][A-Za-z]{2,}))=|\\/(?<Destination2>([A-Z][A-Za-z]{2,}))\\/";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(line);
        while (matcher.find()) {
            if (matcher.group("Destination") != null) {
                destinations.add(matcher.group("Destination"));
            }
            if (matcher.group("Destination2") != null) {
                destinations.add(matcher.group("Destination2"));
            }
        }

        if (destinations.isEmpty()) {
            System.out.println("Destinations:");
            System.out.print("Travel Points: 0");
        } else {
            System.out.print("Destinations: ");
            int count = 0;
            for (int i = 0; i < destinations.size(); i++) {
                if (i == destinations.size() - 1) {
                    System.out.println(destinations.get(i));
                } else {
                    System.out.print(destinations.get(i) + ", ");
                }
                count += destinations.get(i).length();
            }
            System.out.println("Travel Points: " + count);

        }
    }
}
