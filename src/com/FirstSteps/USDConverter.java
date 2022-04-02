package com.FirstSteps;

import java.util.Scanner;

public class USDConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        System.out.println(usd * 1.79549);
    }
}
