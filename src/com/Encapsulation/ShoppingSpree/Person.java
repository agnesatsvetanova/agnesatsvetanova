package com.Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products = new ArrayList<>();

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product product) {
        if (product.getCost() <= this.money) {
            System.out.printf("%s bought %s\n", this.name, product.getName());
            this.products.add(product);
            this.money -= product.getCost();
        } else {
            System.out.printf("%s can't afford %s\n", this.name, product.getName());
        }
    }

    public String getName() {
        return name;
    }

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
    }
}
