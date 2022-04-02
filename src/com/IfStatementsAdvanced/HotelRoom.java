package com.IfStatementsAdvanced;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int countStays = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;

        if (month.equals("May") || month.equals("October")) {
            priceStudio = countStays * 50;
            priceApartment = countStays * 65;
            if (countStays <= 7) {
                priceStudio = priceStudio - (priceStudio * 0.05);
            } else if (countStays >= 14) {
                priceStudio = priceStudio - (priceStudio * 0.30);
                priceApartment = priceApartment - (priceApartment * 0.10);
            }
        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = countStays * 75.20;
            if (countStays >= 14) {
                priceStudio = priceStudio - (priceStudio * 0.20);
                priceApartment = priceApartment - (priceApartment * 0.10);
            }
        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = countStays * 76.00;
            if (countStays >= 14) {
                priceApartment = priceApartment - (priceApartment * 0.10);
            }
        }
        System.out.printf("Apartment: %.2f lv. %n", priceApartment);
        System.out.printf("Studio: %.2f lv.%n", priceStudio);

    }
}
