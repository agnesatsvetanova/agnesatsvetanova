package com.Inheritance.Vehicle;

public class Vehicle {
    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    protected double fuelConsumption;
    protected double fuel;
    protected int HorsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        HorsePower = horsePower;
        setFuelConsumption(fuelConsumption);
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    public void drive(double km) {
        double travelled = km * this.fuelConsumption;
        if (travelled > this.fuel) {
            return;
        }

        this.fuel -= travelled;
    }
}
