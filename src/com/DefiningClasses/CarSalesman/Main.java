package com.DefiningClasses.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Engine> engineMap = new LinkedHashMap<>();
        List<Car> carList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            String engineModel = line[0];
            String power = line[1];
            if (line.length == 2) {
                Engine engine = new Engine(engineModel, power, "n/a", "n/a");
                engineMap.put(engineModel, engine);
            } else if (Character.isDigit(line[2].charAt(0)) && line.length == 3) {
                Engine engine = new Engine(engineModel, power, line[2], "n/a");
                engineMap.put(engineModel, engine);
            } else if (Character.isLetter(line[2].charAt(0)) && line.length == 3) {
                Engine engine = new Engine(engineModel, power, "n/a", line[2]);
                engineMap.put(engineModel, engine);
            } else {
                Engine engine = new Engine(engineModel, power, line[2], line[3]);
                engineMap.put(engineModel, engine);
            }
        }

        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < m; i++) {
            String[] line = scanner.nextLine().split(" ");
            String model = line[0];
            String engineModel = line[1];
            Engine engine1 = engineMap.get(engineModel);
            if (line.length == 2) {
                Car car = new Car(model, engine1, "n/a", "n/a");
                carList.add(car);
            } else if (Character.isDigit(line[2].charAt(0)) && line.length == 3){
                Car car = new Car(model, engine1, line[2], "n/a");
                carList.add(car);
            } else if (Character.isLetter(line[2].charAt(0)) && line.length == 3) {
                Car car = new Car(model, engine1, "n/a", line[2]);
                carList.add(car);
            } else {
                Car car = new Car(model, engine1, line[2], line[3]);
                carList.add(car);
            }
        }
        for (Car c : carList){
            System.out.println(c);
        };
    }
}

