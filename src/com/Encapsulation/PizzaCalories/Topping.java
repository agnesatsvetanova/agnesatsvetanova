package com.Encapsulation.PizzaCalories;

import java.util.Locale;

public class Topping {
    private String toppingType;
    private double weight;

    public String getToppingType() {
        return toppingType;
    }

    public double getWeight() {
        return weight;
    }

    public void setToppingType(String toppingType) {
        if (!toppingType.equals("Meat") && !toppingType.equals("Veggies") && !toppingType.equals("Cheese") && !toppingType.equals("Sauce")) {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
        this.toppingType = toppingType;
    }

    public void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    enum Modifier {
        MEAT(1.2),
        VEGGIES(0.8),
        CHEESE(1.1),
        SAUCE(0.9);

        private double value;

        Modifier(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }

    public double calculateToppingCalories() {
        double result = (2 * this.weight) * Modifier.valueOf(this.toppingType.toUpperCase()).getValue();
        return result;
    }
}
