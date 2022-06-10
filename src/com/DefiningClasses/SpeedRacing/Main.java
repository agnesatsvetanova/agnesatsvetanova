package com.DefiningClasses.SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            String modelName = line[0];
            double fuelAmount = Double.parseDouble(line[1]);
            double fuelCostForOneKm = Double.parseDouble(line[2]);
            Car car = new Car(modelName, fuelAmount, fuelCostForOneKm, 0);
            carMap.put(modelName, car);
        }
        String command = scanner.nextLine();
        while (command.startsWith("Drive")){
            String[] split = command.split(" ");
            String model = split[1];
            double neededDistance = Double.parseDouble(split[2]);
            Car car = carMap.get(model);
            car.checkAndUpdate(neededDistance);
            carMap.put(model, car);
            command = scanner.nextLine();
        }

        for (Map.Entry<String, Car> car : carMap.entrySet()){
            System.out.println(car.getValue().getModel() + " " + String.format("%.2f", car.getValue().getFuelAmount()) + " " + (int)car.getValue().getDistance());
        }
    }
}
