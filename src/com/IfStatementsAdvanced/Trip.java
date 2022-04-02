package com.IfStatementsAdvanced;

import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double sum = 0;
        String destination = "";
        String placeToStay = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("Summer")) {
                placeToStay = "Camping";
                sum = (budget * 0.30);
            } else if (season.equals("Winter")) {
                placeToStay = "Hotel";
                sum = (budget * 0.70);
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("Summer")) {
                placeToStay = "Camping";
                sum = (budget * 0.40);
            } else if (season.equals("Winter")) {
                placeToStay = "Hotel";
                sum = (budget * 0.80);
            }
        } else {
            destination = "Europe";
            placeToStay = "Hotel";
            sum = (budget * 0.90);
        }
        System.out.printf("Somewhere in %s.%n", destination);
        System.out.printf("%s - %.2f", placeToStay, sum);

}}
