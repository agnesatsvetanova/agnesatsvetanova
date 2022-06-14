package com.ExamPreparationJavaAdvancedLab;

import java.util.*;
import java.util.stream.Collectors;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> recipes = new LinkedHashMap<>();
        recipes.put(25, "Bread");
        recipes.put(50, "Cake");
        recipes.put(75, "Pastry");
        recipes.put(100, "Fruit Pie");

        ArrayDeque<Integer> liquidsQue = new ArrayDeque<>();
        ArrayDeque<Integer> ingredientsStack = new ArrayDeque<>();

        String[] line = scanner.nextLine().split(" ");
        for (int i = 0; i < line.length; i++) {
            liquidsQue.offer(Integer.parseInt(line[i]));
        }

        line = scanner.nextLine().split(" ");
        for (int i = 0; i < line.length; i++) {
            ingredientsStack.push(Integer.parseInt(line[i]));
        }

        Map<String, Integer> productsMade = new LinkedHashMap<>();
        productsMade.put("Bread", 0);
        productsMade.put("Cake", 0);
        productsMade.put("Fruit Pie", 0);
        productsMade.put("Pastry", 0);

        while (!liquidsQue.isEmpty() && !ingredientsStack.isEmpty()) {
            int sum = liquidsQue.peek() + ingredientsStack.peek();
            if (recipes.containsKey(sum)) {
                liquidsQue.poll();
                ingredientsStack.pop();
                productsMade.put(recipes.get(sum), productsMade.get(recipes.get(sum)) + 1);
            } else {
                liquidsQue.poll();
                ingredientsStack.push(ingredientsStack.pop() + 3);
            }
        }


        if (!liquidsQue.isEmpty() || !ingredientsStack.isEmpty()) {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        } else {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        }

        if (!liquidsQue.isEmpty()) {
            System.out.print("Liquids left: ");
            List<String> list = new ArrayList<>();
            while (!liquidsQue.isEmpty()) {
                list.add(String.valueOf(liquidsQue.poll()));
            }
            System.out.println(String.join(", ", list));
        } else {
            System.out.println("Liquids left: none");
        }

        if (!ingredientsStack.isEmpty()) {
            System.out.print("Ingredients left: ");
            List<String> list = new ArrayList<>();
            while (!ingredientsStack.isEmpty()) {
                list.add(String.valueOf(ingredientsStack.pop()));
            }
            System.out.println(String.join(", ", list));

        } else {
            System.out.println("Ingredients left: none");
        }
        for (Map.Entry<String, Integer> p : productsMade.entrySet()){
            System.out.println(p.getKey() + ": " + p.getValue());
        }
    }
}
