package com.SoftUniExamsPractice;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> plantsRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantsRating = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("<->");
            String name = line[0];
            int rarity = Integer.parseInt(line[1]);
            plantsRarity.put(name, rarity);
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            if (command.startsWith("Rate: ")) {
                String replaced = command.replace("Rate: ", "");
                String[] split = replaced.split(" - ");
                String name = split[0];
                double rate = Double.parseDouble(split[1]);
                if(!plantsRarity.containsKey(name)) {
                  System.out.println("error");
                } else if (!plantsRating.containsKey(name)) {
                    List<Double> ratings = new ArrayList<>();
                    ratings.add(rate);
                    plantsRating.put(name, ratings);
                } else {
                    List<Double> currRatings = plantsRating.get(name);
                    currRatings.add(rate);
                    plantsRating.put(name, currRatings);
                }
            } else if (command.startsWith("Update: ")) {
                String replaced = command.replace("Update: ", "");
                String[] split = replaced.split(" - ");
                String name = split[0];
                if(!plantsRarity.containsKey(name)) {
                    System.out.println("error");
                } else {
                    int rarity = Integer.parseInt(split[1]);
                    plantsRarity.put(name, rarity);
                }
            } else if (command.startsWith("Reset: ")) {
                String name = command.replace("Reset: ", "");
                if(!plantsRarity.containsKey(name)) {
                    System.out.println("error");
                } else if (plantsRating.containsKey(name)) {
                    plantsRating.put(name, new ArrayList<>());
                }
            }
            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> r : plantsRarity.entrySet()) {
            String plantName = r.getKey();
            int rarity = r.getValue();
            List<Double> ratings = plantsRating.get(plantName);
            double rate = 0d;
            if (ratings != null && !ratings.isEmpty()) {
                for (int i = 0; i < ratings.size(); i++) {
                    rate += ratings.get(i);
                }
                rate /= ratings.size();
            }
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plantName, rarity, rate);
        }
    }
}
