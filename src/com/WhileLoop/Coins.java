package com.WhileLoop;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double balance = Double.parseDouble(scanner.nextLine());
        int countCoins = 0;

        while (balance != 0) {
            if (balance >= 2) {
                balance = balance - 2;
                countCoins ++;
            } else if (balance >= 1) {
                balance = balance - 1;
                countCoins ++;
            } else if (balance >= 0.5) {
                balance = balance - 0.5;
                countCoins ++;
            } else if (balance >= 0.2) {
                balance = balance - 0.2;
                countCoins ++;
            } else if (balance >= 0.1) {
                balance = balance - 0.1;
                countCoins ++;
            } else if (balance >= 0.05) {
                balance = balance - 0.05;
                countCoins ++;
            } else if (balance >= 0.02) {
                balance = balance - 0.02;
                countCoins ++;
            } else if (balance >= 0.01) {
                balance = balance - 0.01;
                countCoins ++;
            }
            balance = Double.parseDouble(String.format("%.2f", balance));
        }
        System.out.println(countCoins);
    }
}
