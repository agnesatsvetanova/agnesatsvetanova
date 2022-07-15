package com.Encapsulation.ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
}
