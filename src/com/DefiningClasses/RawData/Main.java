package com.DefiningClasses.RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            String model = line[0];
            int engineSpeed = Integer.parseInt(line[1]);
            int enginePower = Integer.parseInt(line[2]);
            int cargoWeight = Integer.parseInt(line[3]);
            String cargoType = (line[4]);
            double tire1Pressure = Double.parseDouble(line[05]);
            int tire1Age = Integer.parseInt(line[6]);
            double tire2Pressure = Double.parseDouble(line[7]);
            int tire2Age = Integer.parseInt(line[8]);
            double tire3Pressure = Double.parseDouble(line[9]);
            int tire3Age = Integer.parseInt(line[10]);
            double tire4Pressure = Double.parseDouble(line[11]);
            int tire4Age = Integer.parseInt(line[12]);
            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire tire = new Tire(tire1Pressure, tire1Age, tire2Pressure, tire2Age, tire3Pressure, tire3Age, tire4Pressure, tire4Age);
            Car car = new Car(model, engine, cargo, tire);
            cars.put(model, car);
        }

        String command = scanner.nextLine();
        if (command.equals("fragile")) {
            for (Map.Entry<String, Car> car : cars.entrySet()) {
                Car car1 = car.getValue();
                if (car1.getCargo().getCargoType().equals("fragile")) {
                    Tire t = car1.getTires();
                    if (t.getTire1Pressure() < 1 || t.getTire2Pressure() < 1 || t.getTire3Pressure() < 1 || t.getTire4Pressure() < 1) {
                        System.out.println(car.getKey());
                    }

                }
            }
        } else {
            for (Map.Entry<String, Car> car : cars.entrySet()) {
                Car car1 = car.getValue();
                if (car1.getCargo().getCargoType().equals("flamable") && car1.getEngine().getEnginePower() > 250) {
                    System.out.println(car.getKey());
                }
            }
        }
    }
}
