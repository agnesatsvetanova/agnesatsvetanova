package com.Encapsulation.PizzaCalories;

import java.util.Locale;
import java.util.Map;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setBakingTechnique(bakingTechnique);
        setFlourType(flourType);
        setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public String getFlourType() {
        return flourType;
    }

    public String getBakingTechnique() {
        return bakingTechnique;
    }

    public void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public void setFlourType(String flourType) {
        if (!flourType.equals("White") && !flourType.equals("Wholegrain")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    public void setBakingTechnique(String bakingTechnique) {
        if (!bakingTechnique.equals("Crispy") && !bakingTechnique.equals("Chewy") && !bakingTechnique.equals("Homemade")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    public enum Modifiers {
        WHITE(1.5d),
        WHOLEGRAIN(1.0d),
        CRISPY(0.9d),
        CHEWY(1.1d),
        HOMEMADE(1.0d);

        private double value;

        Modifiers(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }
    public double calculateDoughCalories() {
        double result = (2 * this.weight) * Modifiers.valueOf(this.flourType.toUpperCase()).getValue() * Modifiers.valueOf(this.bakingTechnique.toUpperCase()).getValue();
        return result;
    }
}
