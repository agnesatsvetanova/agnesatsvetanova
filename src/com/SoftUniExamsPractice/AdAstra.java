package com.SoftUniExamsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String pattern = "(\\||#)(?<Name>([A-Za-z\\s+]+))\\1(?<ExpDate>((\\d+){2})\\/(\\d+){2}\\/(\\d+){2})(\\||#)(?<Calories>\\d+)\\1";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(line);
        List<Item> items = new ArrayList<>();
        int sumCalories = 0;

        while (matcher.find()) {
            String product = matcher.group("Name");
            String expDate = matcher.group("ExpDate");
            int calories = Integer.parseInt(matcher.group("Calories"));
            Item item = new Item(product, expDate, calories);
            items.add(item);
            sumCalories += calories;
        }

        int countDays = sumCalories / 2000;
        if (countDays > 0) {
            System.out.printf("You have food to last you for: %d days!%n", countDays);

            for (Item i : items) {
                System.out.println("Item: " + i.name + ", " + "Best before: " + i.expDate + ", " + "Nutrition: " + i.calories);
            }
        } else {
            System.out.printf("You have food to last you for: 0 days!");
        }
    }

    static class Item {
        String name;
        String expDate;
        int calories;

        public Item(String name, String expDate, int calories) {
            this.name = name;
            this.expDate = expDate;
            this.calories = calories;
        }
    }
}
