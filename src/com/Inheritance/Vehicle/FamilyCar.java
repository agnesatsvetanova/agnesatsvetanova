package com.Inheritance.Vehicle;

public class FamilyCar extends Car{
    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;

    public FamilyCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(fuelConsumption);
    }
}
