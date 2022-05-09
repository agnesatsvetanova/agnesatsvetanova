package com.SoftUniExamsPractice;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Plant> plants = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("<->");
            String name = line[0];
            int rarity = Integer.parseInt(line[1]);
            plants.put(name, new Plant(rarity));
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            if (command.startsWith("Rate: ")) {
                String replaced = command.replace("Rate: ", "");
                String[] split = replaced.split(" - ");
                String name = split[0];
                double rate = Double.parseDouble(split[1]);
                if(!plants.containsKey(name)) {
                  System.out.println("error");
                } else {
                    Plant curPlant = plants.get(name);
                    curPlant.addRating(rate);
                    plants.put(name, curPlant);
                }
            } else if (command.startsWith("Update: ")) {
                String replaced = command.replace("Update: ", "");
                String[] split = replaced.split(" - ");
                String name = split[0];
                int rarity = Integer.parseInt(split[1]);
                if(!plants.containsKey(name)) {
                    System.out.println("error");
                } else {
                    Plant curPlant = plants.get(name);
                    curPlant.setRarity(rarity);
                    plants.put(name, curPlant);
                }
            } else if (command.startsWith("Reset: ")) {
                String name = command.replace("Reset: ", "");
                if(!plants.containsKey(name)) {
                    System.out.println("error");
                } else {
                    Plant curPlant = plants.get(name);
                    curPlant.clearRating();
                    plants.put(name, curPlant);
                }
            }
            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Plant> p : plants.entrySet()) {
            Plant plant = p.getValue();
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", p.getKey(), plant.getRarity(), plant.getExactRating());
        }
    }

    public static class Plant {
        private Integer rarity;
        private Double ratingSum;
        private Integer ratingCount;

        public Plant(Integer rarity) {
            this.rarity = rarity;
            this.ratingSum = 0d;
            this.ratingCount = 0;
        }

        public Integer getRarity() {
            return rarity;
        }

        public void setRarity(Integer rarity) {
            this.rarity = rarity;
        }

        public void addRating(Double rating) {
            this.ratingSum += rating;
            this.ratingCount++;
        }

        public void clearRating() {
            this.ratingSum = 0d;
            this.ratingCount = 0;
        }

        public Double getExactRating() {
            if(ratingCount == 0) {
                return 0d;
            }
            return ratingSum / ratingCount;
        }
    }
}
