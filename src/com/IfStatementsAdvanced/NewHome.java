package com.IfStatementsAdvanced;

import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int countFLowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        if (flowers.equals("Roses")) {
            sum = countFLowers * 5;
            if (countFLowers > 80) {
                sum = sum - (sum * 0.10);
            }
        } else if (flowers.equals("Dahlias")) {
            sum = countFLowers * 3.80;
            if (countFLowers > 90) {
                sum = sum - (sum * 0.15);
            }
        } if (flowers.equals("Tulips")) {
            sum = countFLowers * 2.80;
            if (countFLowers > 80) {
                sum = sum - (sum * 0.15);
            }
        } if (flowers.equals("Daffodils")) {
            sum = countFLowers * 3;
            if (countFLowers < 120) {
                sum = sum + (sum * 0.15);
            }
        } if (flowers.equals("Gladiolas")) {
            sum = countFLowers * 3;
            if (countFLowers < 80) {
                sum = sum + (sum * 0.20);
            }
        }
        if (budget > sum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFLowers, flowers, budget - sum);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", sum - budget);
        }

}}
