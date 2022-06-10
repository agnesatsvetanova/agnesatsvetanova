package com.DefiningClasses.SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostForOneKm;
    private double distance;

    public Car(String model, double fuelAmount, double fuelCostForOneKm, double distance) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostForOneKm = fuelCostForOneKm;
        this.distance = distance;

    }

    public Car(String model, double fuelAmount, double fuelCostForOneKm) {
        this.distance = 0;
    }

    public double getFuelCostForOneKm() {
        return this.fuelCostForOneKm;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getDistance() {
        return this.distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getModel() {
        return this.model;
    }

    public void checkAndUpdate(double neededDistance) {
        double possibleDistance = (this.fuelAmount / this.fuelCostForOneKm);
        if (possibleDistance >= neededDistance) {
            this.distance += neededDistance;
            double spentFuel = neededDistance * this.fuelCostForOneKm;
            this.fuelAmount = this.fuelAmount - spentFuel;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }
}

