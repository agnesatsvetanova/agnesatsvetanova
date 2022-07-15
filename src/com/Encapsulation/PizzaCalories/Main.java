package com.Encapsulation.PizzaCalories;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lineOne = scanner.nextLine().split(" ");
        String pizzaName = lineOne[1];
        int numOfToppings = Integer.parseInt(lineOne[2]);
        if (numOfToppings < 0 || numOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }

        String[] lineTwo = scanner.nextLine().split(" ");
        String flourType = lineTwo[1];
        String bakingTechnique = lineTwo[2];
        double weight = Double.parseDouble(lineTwo[3]);

        Dough dough = new Dough(flourType, bakingTechnique, weight);
        Pizza pizza = new Pizza(pizzaName, dough);

        String lineThree = scanner.nextLine();
        while(!lineThree.equals("END")) {
            String[] tokens = lineThree.split(" ");
            String toppingType = tokens[1];
            double weightOfTopping = Double.parseDouble(tokens[2]);
            Topping topping = new Topping(toppingType, weightOfTopping);
            pizza.addToppings(topping);

            lineThree = scanner.nextLine();
        }

        List<Topping> topp = pizza.getToppings();
        double cal = dough.calculateDoughCalories();
        for (Topping top : topp) {
            cal += top.calculateToppingCalories();
        }

        System.out.printf("%s - %.2f\n", pizzaName, cal);
    }
}
