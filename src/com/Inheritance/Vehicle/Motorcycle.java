package com.Inheritance.Vehicle;

public class Motorcycle extends Vehicle{
    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;

    public Motorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(fuelConsumption);
    }


}
