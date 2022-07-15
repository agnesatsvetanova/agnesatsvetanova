package com.Inheritance.Vehicle;

public class CrossMotorcycle extends Motorcycle{
    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;

    public CrossMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(fuelConsumption);
    }
}
