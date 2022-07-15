package com.Encapsulation.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings = new ArrayList<>();

    public void setName(String name) {
        if (name.length() == 0 || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        } else {
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == ' ') {
                    throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
                }
            }
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Dough getDough() {
        return dough;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public Pizza(String name, Dough dough) {
        this.name = name;
        this.dough = dough;
        this.toppings = new ArrayList<>();
    }

    public void addToppings(Topping topping) {
        this.toppings.add(topping);
    }
}
