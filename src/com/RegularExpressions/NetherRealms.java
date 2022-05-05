package com.RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(",\\s+");
        for (int i = 0; i < line.length; i++) {
            String hero = line[i];
            int health = 0;
            String reg = "[^\\d\\+\\-\\*\\./]";
            Pattern regex = Pattern.compile(reg);
            Matcher matcher = regex.matcher(hero);
            while (matcher.find()) {
                health += (int)(matcher.group().charAt(0));
            }

            double damage = 0;
            String regTwo = "(?:\\+|-)?[0-9]+(?:\\.[0-9]+)?";
            Pattern regexTwo = Pattern.compile(regTwo);
            Matcher matcherTwo = regexTwo.matcher(hero);
            while (matcherTwo.find()) {
                damage += Double.parseDouble(matcherTwo.group());
            }

            for (int j = 0; j < hero.length(); j++) {
                if (hero.charAt(j) == '*'){
                    damage *= 2;
                } else if (hero.charAt(j) == '/'){
                    damage /= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", hero, health, damage);
        }
    }
}
