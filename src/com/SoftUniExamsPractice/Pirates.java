package com.SoftUniExamsPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, TownCharacteristics> towns = new LinkedHashMap<>();

        while (!command.equals("Sail")) {
            String[] split = command.split("\\|\\|");
            String town = split[0];
            int population = Integer.parseInt(split[1]);
            int gold = Integer.parseInt(split[2]);
            if (!towns.containsKey(town)) {
                TownCharacteristics townCharacteristics = new TownCharacteristics(population, gold);
                towns.put(town, townCharacteristics);
            } else {
                TownCharacteristics townCharacteristics = towns.get(town);
                townCharacteristics.increaseCharacteristics(population, gold);
                towns.put(town, townCharacteristics);
            }
            command = scanner.nextLine();
        }

        command = scanner.nextLine();

        while (!command.equals("End")) {
            if (command.startsWith("Plunder")) {
                String[] split = command.split("=>");
                String action = split[0];
                String town = split[1];
                int people = Integer.parseInt(split[2]);
                int gold = Integer.parseInt(split[3]);

                if (towns.get(town).getPopulation() - people <= 0 || towns.get(town).getGold() - gold <= 0) {
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                    System.out.printf("%s has been wiped off the map!%n", town);
                    towns.remove(town);
                } else {
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                    TownCharacteristics townCharacteristics = towns.get(town);
                    townCharacteristics.remainPopulationAndGold(people, gold);
                    towns.put(town, townCharacteristics);
                }
            } else if (command.startsWith("Prosper")) {
                String[] split = command.split("=>");
                String action = split[0];
                String town = split[1];
                int gold = Integer.parseInt(split[2]);
                if (gold < 0){
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    TownCharacteristics townCharacteristics = towns.get(town);
                    townCharacteristics.increaseTreasury(gold);
                    towns.put(town, townCharacteristics);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, towns.get(town).getGold());
                }
            }
            command = scanner.nextLine();
        }
        if (towns.isEmpty()){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", towns.size());
            for (Map.Entry<String, TownCharacteristics> t : towns.entrySet()){
                System.out.println(t.getKey() + " -> Population: " + t.getValue().getPopulation() + " citizens, Gold: " + t.getValue().getGold() + " kg");
            }
        }

    }

    public static class TownCharacteristics {
        private int population;
        private int gold;

        public TownCharacteristics(int population, int gold) {
            this.population = population;
            this.gold = gold;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        public void increaseCharacteristics(int population, int gold) {
            this.population += population;
            this.gold += gold;
        }
        public void increaseTreasury(int gold){
            this.gold += gold;
        }
        public void remainPopulationAndGold(int people, int gold){
            this.population -= people;
            this.gold -= gold;
        }
    }
}
