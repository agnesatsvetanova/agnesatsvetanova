package com.FirstSteps;

import java.util.Scanner;

public class Materials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double pensPrice = pens * 5.80;
        double detergentPrice = detergent * 1.20;
        double markersPrice = markers * 7.20;
        double sum = pensPrice + detergentPrice + markersPrice;
        discount = discount / 100;
        double priceWithDiscount = sum - (sum * discount);
        System.out.println(priceWithDiscount);
    }
}
