package com.IfStatementsAdvanced;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        int fishermen = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;

        if (season.equals("Spring")) {
            price += 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            price += 4200;
        } else if (season.equals("Winter")) {
            price += 2600;
        } else {

        }

        if (fishermen <= 6) {
            price = price - (price * 0.10);
        } else if (fishermen > 7 && fishermen <= 11) {
            price = price - (price * 0.15);
        } else {
            price = price - (price * 0.15);
        }
        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            price = price - (price * 0.05);
        }
        if (budget > price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}
