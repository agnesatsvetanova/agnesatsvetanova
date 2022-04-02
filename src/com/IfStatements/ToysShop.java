package com.IfStatements;

import java.util.Scanner;

public class ToysShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursion = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double totalSum = puzzles * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.00;
        int totalToys = puzzles + dolls + bears + minions + trucks;

        if (totalToys >= 50) {
            totalSum = totalSum - totalSum * 0.25;
        }
        double profit = totalSum - totalSum * 0.1;

        if (profit >= excursion) {
            System.out.printf("Yes! %.2f lv left.", profit - excursion);
        }else {
            System.out.printf("Not enough money! %.2f lv needed", excursion - profit);
        }
    }
}
