package com.ForLoops;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();
        double washingMachine = scanner.nextDouble();
        int toyPrice = scanner.nextInt();

        int money = 0;
        double allMoney = 0;
        for (int i = 1; i <= years; i++) {
            if (i % 2 == 0) {
                money += 10;
                allMoney += money-1;
            } else {
                allMoney += toyPrice;
            }
        }

        if (allMoney > washingMachine) {
            System.out.printf("Yes! %.2f%n", allMoney - washingMachine);
        } else {
            System.out.printf("No! %.2f%n", washingMachine - allMoney);
        }
    }
}
