package com.Maps;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> legendaryItems = new LinkedHashMap<>();


        boolean foundLegendaryItem = false;
        while (!foundLegendaryItem) {
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            for (int i = 0; i < split.length; i = i + 2) {
                int quantity = Integer.parseInt(split[i]);
                String item = (split[i + 1]).toLowerCase();
                if (!legendaryItems.containsKey(item)) {
                    legendaryItems.put(item, quantity);
                } else {
                    legendaryItems.put(item, legendaryItems.get(item) + quantity);
                }

                if (legendaryItems.get(item) >= 250 && !foundLegendaryItem) {
                    foundLegendaryItem = true;
                    if (item.equals("shards")) {
                        System.out.println("Shadowmourne obtained!");
                        legendaryItems.put(item, legendaryItems.get(item) - 250);
                        break;
                    } else if (item.equals("fragments")) {
                        System.out.println("Valanyr obtained!");
                        legendaryItems.put(item, legendaryItems.get(item) - 250);
                        break;
                    } else if (item.equals("motes")){
                        System.out.println("Dragonwrath obtained!");
                        legendaryItems.put(item, legendaryItems.get(item) - 250);
                        break;
                    }
                }
            }
        }
        if (legendaryItems.containsKey("shards")){
            System.out.println("shards: " + legendaryItems.get("shards"));
            legendaryItems.remove("shards");
        } else {
            System.out.println("shards: 0");
        }
        if (legendaryItems.containsKey("fragments")){
            System.out.println("fragments: " + legendaryItems.get("fragments"));
            legendaryItems.remove("fragments");
        } else {
            System.out.println("fragments: 0");
        }
        if (legendaryItems.containsKey("motes")){
            System.out.println("motes: " + legendaryItems.get("motes"));
            legendaryItems.remove("motes");
        } else {
            System.out.println("motes: 0");
        }

        for (Map.Entry<String, Integer> entry : legendaryItems.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}