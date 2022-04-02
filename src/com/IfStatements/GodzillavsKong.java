package com.IfStatements;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        if (statists > 150) {
            clothes = clothes  - (clothes * 0.10);
        }
        double decor = budget * 0.10;
        double sumClothes = statists * clothes;
        double sumBudget = decor + sumClothes;

        if (sumBudget > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", sumBudget - budget);
    }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left", budget - sumBudget);
        }
}}
