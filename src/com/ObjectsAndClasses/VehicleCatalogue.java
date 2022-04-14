package com.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();
        List<String> models = new ArrayList<>();
        List<Vehicle> veh = new ArrayList<>();
        while (!command.equals("End")){
            String[] arr = command.split("\\s+");
            Vehicle vehicle = new Vehicle(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]));
            vehicles.add(vehicle);
            command = scanner.nextLine();
        }

        command = scanner.nextLine();
        while (!command.equals("Close the Catalogue")){
            models.add(command);
            command = scanner.nextLine();
        }

        for (int i = 0; i < models.size(); i++) {
            for (int j = 0; j < vehicles.size(); j++) {
                if (vehicles.get(j).getModel().equals(models.get(i))){
                    veh.add(vehicles.get(j));
                }
            }
        }
        int cars = 0;
        int carsCounter = 0;
        int trucks = 0;
        int truckCounter = 0;
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getType().equals("car")){
                cars += vehicles.get(i).getHorsePower();
                carsCounter++;
            } else {
                trucks += vehicles.get(i).getHorsePower();
                truckCounter++;
            }
        }

        for (Object v : veh){
            System.out.println(v);
        }
        double avgCars = 1.0 * cars / (carsCounter == 0 ? 1 : carsCounter);
        double avgTrucks = 1.0 * trucks / (truckCounter == 0 ? 1 : truckCounter);
        System.out.printf("Cars have average horsepower of %.2f.%n", avgCars);
        System.out.printf("Trucks have average horsepower of %.2f.", avgTrucks);
    }
    public static class Vehicle{
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public Vehicle(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Type: " + type + "\nModel: " + model + "\nColor: " + color + "\nHorsepower: "  + horsePower;
        }
    }
}
