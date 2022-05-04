package com.RegularExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "S|s|T|t|A|a|R|r";
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int count = 0;
            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(input);
            while (matcher.find()) {
                count++;
            }
            char[] array = input.toCharArray();
            StringBuilder decrypted = new StringBuilder();
            for (int j = 0; j < array.length; j++) {
                char symbol = (char) (array[j] - count);
                decrypted.append(symbol);
            }

            String reg = ".*@(?<Planet>[A-Za-z]*)[^\\W\\@\\-\\!\\:]?:(?<Population>\\d+)!(?<attackType>[A|D])!->(?<soldierCount>\\d+).*";
            Pattern pattern2 = Pattern.compile(reg);
            Matcher matcher2 = pattern2.matcher(decrypted.toString());
            if (matcher2.matches()) {
                String planet = matcher2.group("Planet");
                String attackType = matcher2.group("attackType");
                if (attackType.equals("A")) {
                    attackedPlanets.add(planet);
                } else if (attackType.equals("D")) {
                    destroyedPlanets.add(planet);
                }
            }
        }
        if (attackedPlanets.isEmpty()) {
            System.out.println("Attacked planets: 0");
        } else {
            System.out.println("Attacked planets: " + attackedPlanets.size());
        }
        Collections.sort(attackedPlanets);
        for (String a : attackedPlanets) {
            System.out.println("-> " + a);
        }

        if (destroyedPlanets.isEmpty()) {
            System.out.println("Destroyed planets: 0");
        } else {
            System.out.println("Destroyed planets: " + destroyedPlanets.size());
        }
        Collections.sort(destroyedPlanets);
        for (String d : destroyedPlanets) {
            System.out.println("-> " + d);
        }
    }
}
