package com.FirstSteps;

import java.util.Scanner;

public class Deposits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        double interestPerMonth = deposit * (interest/100) / 12;
        double sum = deposit + months * interestPerMonth;
        System.out.println(sum);


    }
}
