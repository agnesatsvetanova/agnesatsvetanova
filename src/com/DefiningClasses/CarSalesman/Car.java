package com.DefiningClasses.CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this.weight = "n/a";
        this.color = "n/a";
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.model + ": \n" + engine.getModel() + ": \n" + "Power: " + engine.getPower()
                + "\nDisplacement: " + engine.getDisplacement() + "\nEfficiency: " + engine.getEfficiency() +
                "\nWeight: " + this.weight + "\nColor: " + this.color;
    }
}
